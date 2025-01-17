abstract  class Shape3D {
  /*  Write a Java program to create an abstract
    class Shape3D with abstract methods calculateVolume()
    and calculateSurfaceArea(). Create subclasses Sphere and
    Cube that extend the Shape3D class and implement the respective methods
            to calculate the volume and surface area of each shape. */

  //  protected double side;
  public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
    }

class Sphere extends Shape3D {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculateVolume(){
          return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
  public double calculateSurfaceArea(){
      return 4 * Math.PI * Math.pow(radius, 2);
    }
    }
class cube extends Shape3D{
    private double sideLength;
    public cube(double sideLength){
        this.sideLength = sideLength;
    }
    public double calculateVolume(){
        return Math.pow(sideLength, 3);
    }
    public double calculateSurfaceArea(){
        return 6 * Math.pow(sideLength, 2);
    }
}

