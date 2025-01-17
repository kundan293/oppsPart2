package JAva.Interface;

public class Resize {
    public static void main(String[] argts){
        Rectangle2 rectangle = new Rectangle2(34, 45);
        rectangle.printSize();

        rectangle.resizewidth(150);
        rectangle.resizedHeight(200);

        rectangle.printSize();
    }
}
