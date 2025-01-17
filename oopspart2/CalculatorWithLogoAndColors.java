import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorWithLogoAndColors extends JFrame {

    // Declare components
    private JTextField displayField;
    private StringBuilder currentInput = new StringBuilder();
    private double result = 0;
    private String lastOperator = "=";

    public CalculatorWithLogoAndColors() {
        setTitle("Calculator with Logo and Colors");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Set the logo for the window (replace with your logo image path)
        setIconImage(new ImageIcon("calculator_logo.png").getImage());  // ImageIcon for logo

        // Create the display field with custom font and background color
        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setBackground(new Color(0xD3D3D3)); // Light grey background
        displayField.setForeground(new Color(0x000000)); // Black text color

        // Panel to hold buttons with custom layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // 5 rows, 4 columns
        buttonPanel.setBackground(new Color(0x282828)); // Dark background for buttons

        // Define button labels and corresponding colors
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "(", ")", "sqrt"
        };

        Color buttonColor = new Color(0x4CAF50); // Green background for most buttons
        Color operatorColor = new Color(0xFF5722); // Red background for operators
        Color functionColor = new Color(0x2196F3); // Blue background for function buttons (C, sqrt)

        // Add buttons to panel with custom colors
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.setFocusPainted(false);
            button.setBackground(isOperator(label) ? operatorColor :
                    (isFunction(label) ? functionColor : buttonColor));
            button.setForeground(Color.WHITE); // White text
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Add the logo image at the top (use a label)
        JLabel logoLabel = new JLabel(new ImageIcon("calculator_logo.png"));  // Add your logo path here
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Layout setup
        setLayout(new BorderLayout(10, 10));
        add(logoLabel, BorderLayout.NORTH);  // Add logo on the top
        add(displayField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Helper method to determine if the button is an operator
    private boolean isOperator(String label) {
        return label.equals("+") || label.equals("-") || label.equals("*") || label.equals("/");
    }

    // Helper method to determine if the button is a function (like C or sqrt)
    private boolean isFunction(String label) {
        return label.equals("C") || label.equals("sqrt");
    }

    // Button click listener
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) == 'C') {
                // Clear the display
                currentInput.setLength(0);
                displayField.setText("");
                result = 0;
                lastOperator = "=";
            } else if (command.charAt(0) == '=') {
                // Perform the calculation when "=" is pressed
                calculate();
                displayField.setText(String.valueOf(result));
                currentInput.setLength(0);  // Clear current input
                lastOperator = "=";
            } else if ("0123456789".contains(command)) {
                // If the button is a number, append it to current input
                currentInput.append(command);
                displayField.setText(currentInput.toString());
            } else if ("+-*/()sqrt".contains(command)) {
                // If the button is an operator, handle the operation
                if (command.equals("sqrt")) {
                    try {
                        double num = Double.parseDouble(currentInput.toString());
                        result = Math.sqrt(num);
                        displayField.setText(String.valueOf(result));
                    } catch (NumberFormatException ex) {
                        displayField.setText("Error");
                    }
                    currentInput.setLength(0);  // Clear current input
                    lastOperator = "=";
                } else {
                    // Process operators like +, -, *, /
                    calculate();
                    lastOperator = command;
                    currentInput.setLength(0);  // Clear current input
                }
            }
        }

        private void calculate() {
            try {
                double currentNumber = Double.parseDouble(currentInput.toString());

                switch (lastOperator) {
                    case "=":
                        result = currentNumber;
                        break;
                    case "+":
                        result += currentNumber;
                        break;
                    case "-":
                        result -= currentNumber;
                        break;
                    case "*":
                        result *= currentNumber;
                        break;
                    case "/":
                        if (currentNumber != 0) {
                            result /= currentNumber;
                        } else {
                            displayField.setText("Error");
                            currentInput.setLength(0);
                            return;
                        }
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                displayField.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the calculator
        SwingUtilities.invokeLater(() -> {
            CalculatorWithLogoAndColors calculator = new CalculatorWithLogoAndColors();
            calculator.setVisible(true);
        });
    }
}
