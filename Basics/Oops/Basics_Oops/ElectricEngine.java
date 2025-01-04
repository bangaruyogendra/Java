package Basics.Oops.Basics_Oops;

public class ElectricEngine implements EngineInterface {

    @Override
    public void start() {
      System.out.println("Electric Engine is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine is Stoping");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine is accelerating");
    }
    
}
