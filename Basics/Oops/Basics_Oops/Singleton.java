package Basics.Oops.Basics_Oops;

public class Singleton {
    //Singalton class having only one instance along private constructor and provides a global point of access to that instance
    private static volatile Singleton instance;
    Singleton(){};
    public static Singleton getInstance(){
        if(instance==null){
            instance  =new Singleton();
        }
        return instance;
    }

}
