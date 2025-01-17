abstract class Birds {
    abstract void fly() ;
    abstract void makeSound();
}
 class Eagle extends Birds{

    @Override
   public  void fly() {
        System.out.println("Eagle : eagle is flaying in askey ");
    }
    @Override
   public  void makeSound() {
        System.out.println(" Eagle: Eagle sound is screeches");
    }
}

class Hawk extends Birds{
    @Override
   public  void fly() {
        System.out.println(" Hawk is flying in askey");
    }

    @Override
   public  void makeSound() {
        System.out.println("hawak: Calls. Call a loud \"kee-aah,\" with second note descending in pitch. ");
    }
}
