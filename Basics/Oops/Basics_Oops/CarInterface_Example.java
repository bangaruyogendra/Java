package Basics.Oops.Basics_Oops;

public class CarInterface_Example {
    private EngineInterface engine;
    private MediaAbstract media = new CDPlayer();
    public CarInterface_Example(){
        engine  = new ElectricEngine();
    }
    public CarInterface_Example(EngineInterface engine){
         this.engine=engine;
    }
    public void engineStart(){
       engine.start();
    }
    public void engineStop(){
        engine.stop();
    }
    public void engineAccelerating(){
        engine.acc();
    }
    public void musicStart(){
        media.start();
    }
    public void musicStop(){
        media.stop();
    }
}
