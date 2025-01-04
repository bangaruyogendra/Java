package Basics.Oops.Basics_Oops;

public abstract class HumanAbstract {
    //abstract class contains alteast one abstract method and that should implemented by subclass must
    int age;
    final int VALUE;
    public HumanAbstract(int age){
        this.age =age;
        VALUE = 123;
    }
    abstract void work();
    //we cant create object for abstract classes
    //abstract class can contains the static method,normal method,abstract method
    static void displayId(){
        System.out.println("Displaying Student Id");
    }
    void displayReg(){
        System.out.println("Displaying Student Register");
    }
    

}
