public class Result {
    public static void main(String[] args) {
            GeometricShape triangle = new Triangle1(4, 5, 6);
            GeometricShape square = new Square(6);

            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.Perimeter());

            System.out.println("Square Area: " + square.area());
            System.out.println("Square Perimeter: " + square.Perimeter());
        }
    }
