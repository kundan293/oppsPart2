package JAva.Interface;
// Write a Java program to create an interface Resizable with methods resizeWidth(int width)
// and resizeHeight(int height) that allow an object to be resized.
// Create a class Rectangle that implements the Resizable interface and implements the resize methods.
public interface ResiZable {
    void resizewidth(int width);
    void resizedHeight(int height);

}
 class Rectangle2 implements ResiZable {
      private int width;
      private int height;

      public Rectangle2 (int width, int height){
          this.width = height;
          this.width = width;
      }
     @Override
     public void resizewidth(int width) {
          this.width = width;
     }

     @Override
     public void resizedHeight(int height) {
           this.height = height;

     }
     public void printSize() {
         System.out.println("Width: " + width + ", Height: " + height);
     }
 }