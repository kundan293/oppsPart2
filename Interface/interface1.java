package JAva.Interface;
import java .util.Scanner;
public class interface1 {
    public static void main(String[] args) {

        // we can passthe value thsis tye
        Rectangle rec = new Rectangle(2 ,4 );
        System.out.println(" rectangle area");
rec.getArea();
// and this type
        Shape Area = new Rectangle(6, 6);
        Area.getArea();
        Shape area = new Circle(34);
           area.getArea();

        Shape areaTraingle = new Traingle(4 , 4);
        System.out.println(" traingle area");
        areaTraingle.getArea();


    }
}
