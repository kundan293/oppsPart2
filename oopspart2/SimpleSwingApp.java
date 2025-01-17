//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SimpleCalculator extends JFrame {
//    private JTextField display;
//    private StringBuilder input = new StringBuilder();
//
//    public SimpleCalculator() {
//        setTitle("Simple Calculator");
//        setSize(300, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Text field for display
//        display = new JTextField();
//        display.setEditable(false);
//        display.setFont(new Font("Arial", Font.PLAIN, 24));
//        display.setHorizontalAlignment(JTextField.RIGHT);
//        add(display, BorderLayout.NORTH);
//
//        // Panel for buttons
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(4, 4));
//
//        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
//
//        // Add buttons to the panel
//        for (String text : buttons) {
//            JButton button = new JButton(text);
//            button.setFont(new Font("Arial", Font.PLAIN, 20));
//            button.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    onButtonClick(e);
//                }
//            });
//            panel.add(button);
//        }
//
//        add(panel, BorderLayout.CENTER);
//    }
//
//    private void onButtonClick(ActionEvent e) {
//        String command = e.getActionCommand();
//
//        if (command.equals("=")) {
//            try {
//                display.setText(eval(input.toString()));
//            } catch (Exception ex) {
//                display.setText("Error");
//            }
//            input.setLength(0);
//        } else {
//            input.append(command);
//            display.setText(input.toString());
//        }
//    }
//
//    private String eval(String expression) {
//        // Simple evaluation logic (use a scripting engine or expression parsing)
//        // For simplicity, we assume the expression is valid
//        return String.valueOf(new Object() {
//            public double eval(String expression) {
//                return new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
//            }
//        }.eval(expression));
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new SimpleCalculator().setVisible(true);
//        });
//    }
//}
