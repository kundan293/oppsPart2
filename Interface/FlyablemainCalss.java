package JAva.Interface;

public class FlyablemainCalss {
    public static void main(String[] args) {


        Flyable[] flyable = {new Helicopter() ,new  Airplane() ,new  Spacecraft()};
        for(Flyable HAS: flyable )
            HAS.fly_obj();
    }
}
