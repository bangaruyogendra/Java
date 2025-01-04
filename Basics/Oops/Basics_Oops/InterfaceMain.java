package Basics.Oops.Basics_Oops;

public class InterfaceMain {
    //every method in engine interface should visible to powerEngine
    public static void main(String[] args) {
        CarInterface_Example carObj = new CarInterface_Example();
        carObj.engineStart();
        carObj.engineAccelerating();
        carObj.musicStart();
        carObj.musicStop();
        carObj.engineStop();
    }
}
