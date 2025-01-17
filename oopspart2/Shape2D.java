//Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
//Create subclasses Rectangle and Circle
//that extend the Shape2D class and implement the respective methods to draw and resize each shape.

abstract class Shape2D {

    abstract void draw();
    abstract void resize();

}

class Rectangle extends Shape2D{

    @Override
    public void draw() {
        System.out.println(" Rectangle: rectangle is Drawing ");
    }

    @Override
    public void resize() {
        System.out.println(" Rectangle ; Rectangle is resized ");
    }
}

class Circle1 extends Shape2D{

    @Override
    public void draw() {
        System.out.println(" cirlcle1: Circle1  is  drwing ");

    }

    @Override
   public  void resize() {
        System.out.println(" Circle : circle is Resize");
    }
}
