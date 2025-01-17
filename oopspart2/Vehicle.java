abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}
  class Car extends Vehicle{

      @Override
      void startEngine() {
          System.out.println("Car engine is start ");
      }
      @Override
      void stopEngine() {
          System.out.println("Car enginee is start ");

      }
  }
  class Motercycle extends Vehicle{

      @Override
      void startEngine() {
          System.out.println("Mptorcycle engine is start ");
      }
      @Override
      void stopEngine() {
          System.out.println(" MoterCycleEnginee is stop ");
      }
  }