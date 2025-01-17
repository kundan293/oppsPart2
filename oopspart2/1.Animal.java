abstract class Animals{
    public abstract void sound();
}
class Lion extends Animals{
    public void sound(){
        System.out.println(" Lion growls" );
    }
}
class Tiger extends Animals{
    public void sound(){
        System.out.println("Tiger growls");
    }
}
 class Animal{
    public static void main(String[] args) {
        Animals lion = new Lion();
        lion.sound();
        Animals tiger = new Tiger();
        tiger.sound();


    }
    }