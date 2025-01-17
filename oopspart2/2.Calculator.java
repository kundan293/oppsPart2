
abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}
// Triangle.java

// Define a subclass named Triangle that extends Shape
class Triangle extends Shape {
    // Declare private double variables to store the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor that accepts three sides and sets them to the corresponding variables
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the calculateArea method to compute the area of the triangle
    @Override
    double calculateArea() {
        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;
        // Return the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override the calculatePerimeter method to compute the perimeter of the triangle
    @Override
    double calculatePerimeter() {
        // Return the perimeter by summing up all the sides
        return side1 + side2 + side3;
    }
}
// Main.java

// Define the Main class
 class Calculator  {
    // Main method to run the program
    public static void main(String[] args) {
        // Declare and initialize the radius for the circle
        double r = 4.0;

        Circle circle = new Circle(r);

        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;

        Triangle triangle = new Triangle(ts1, ts2, ts3);
        System.out.println("Radius of the Circle: " + r);

        System.out.println("Area of the Circle: " + circle.calculateArea());

        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        System.out.println("\nSides of the Triangle are: " + ts1 + ',' + ts2 + ',' + ts3);
        // Print the area of the triangle by calling the calculateArea method
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        // Print the perimeter of the triangle by calling the calculatePerimeter method
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}
