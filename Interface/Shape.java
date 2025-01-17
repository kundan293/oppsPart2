package JAva.Interface;
//import java.security.spec.RSAOtherPrimeInfo;
//Write a Java program to create an interface Shape with the getArea()
// method. Create three classes Rectangle, Circle, and Triangle that
// implement the Shape interface. Implement the getArea()
// method for each of the three classes.
  public interface  Shape {
     void getArea();
}
 class Rectangle  implements Shape{
private int sideLength;
private int width;
    public Rectangle(int sideLength , int width){
    this.sideLength = sideLength;
    this.width = width;
}
    @Override
    public void getArea() {
  int s = sideLength * width;
        System.out.println(s);
    }
}
 class Circle  implements Shape{
     private int radios;
     Circle(int radios){
         this.radios = radios;
     }
     public void getArea(){
         int s = (int)Math.PI*radios;
         System.out.println(s);
     }
}
class Traingle implements Shape{
private int Base;
private int height;

Traingle(int Base , int height)
{
    this.height = height;
    this.Base  = Base;
}
    @Override
    public void getArea() {
int area = 1/2*(Base * height);
        System.out.println(area);
    }
}