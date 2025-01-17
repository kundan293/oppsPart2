package JAva.Interface.Drawablle;

// Main.java

// Import necessary libraries for graphics and user interface
import java.awt.*;
import javax.swing.*;

// Declare the Main class
public class kundan {
    public static void main(String[] args) {
        // Create instances of Drawable objects, which are Circle, Rectangle, and Triangle
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Call the "draw" method to display each shape
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
