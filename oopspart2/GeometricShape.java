//
//Write a Java program to create an abstract class GeometricShape with abstract methods area()
//and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and
//        implement the respective methods
//        to calculate the area and perimeter of each shape.
abstract class GeometricShape {
    abstract double  area();
    abstract double Perimeter();

}
class Triangle1 extends GeometricShape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle1(double side1, double side2, double side3) {
        // Assign the parameters to the instance variables
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double  area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double  Perimeter() {
        return side1 + side2 + side3;
    }
}

