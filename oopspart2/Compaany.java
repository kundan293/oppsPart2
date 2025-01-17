public class Compaany {
    public static void main(String[] args) {
        Employee manager = new Manager("bakchodi manger", 6000, 1000);

        Employee programmer = new Programmer("kundan singh", 5000, 20, 25.00);


        manager.DisplayInformation();

        programmer.DisplayInformation();
        
    }
}