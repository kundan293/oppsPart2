class Square extends GeometricShape {
    private double side;

    Square(double side) {

        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }

    @Override
    double Perimeter() {
        return 4*side;
    }
}
