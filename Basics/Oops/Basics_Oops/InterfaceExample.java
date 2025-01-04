package Basics.Oops.Basics_Oops;

class Example {
    public interface InnerInterface {
        boolean isOdd(int num);
        
    }   
}
public class InterfaceExample implements Example.InnerInterface{
    public boolean isOdd(int num){
        return (num &1)==1;
    }
}

