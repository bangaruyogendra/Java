package Basics.Oops.Basics_Oops;

public class PowerEngine implements EngineInterface {
    @Override
        public void start(){
               System.out.println("Power Engine is starting"); 
            
        }
    @Override
    public void stop() {
        System.out.println("Power Engine is stoping"); 
    }

    @Override
    public void acc() {
        System.out.println("Power Engine is accelerating"); 
       }
}
