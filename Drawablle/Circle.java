package JAva.Interface.Drawablle;

import java.awt.*;
import javax.swing.*;

// Declare the Circle class, which implements the Drawable interface
class Circle implements Drawable {
    // Implement the "draw" method required by the Drawable interface
    public void draw() {
        // Create a new JFrame for displaying the circle
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a JPanel for custom drawing
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to red and fill an oval
                g.setColor(Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}
