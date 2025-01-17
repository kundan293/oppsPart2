package JAva.Interface.Drawablle;
// Triangle.java

// Import necessary libraries for graphics and user interface
import java.awt.*;
import javax.swing.*;

// Declare the Triangle class, which implements the Drawable interface
class Triangle implements Drawable {
    // Implement the "draw" method required by the Drawable interface
    public void draw() {
        // Create a new JFrame for displaying the triangle
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a JPanel for custom drawing
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to green and fill a polygon
                g.setColor(Color.GREEN);
                int[] xPoints = {
                        200,
                        100,
                        300
                };
                int[] yPoints = {
                        100,
                        300,
                        300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}
