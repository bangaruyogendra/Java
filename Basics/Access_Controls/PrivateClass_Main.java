package Basics.Access_Controls;

import java.security.SignedObject;

public class PrivateClass_Main {
    // 1)Private Fields and Methods
    // 2)Private Constructors:Private constructors are used to restrict object creation, commonly in the Singleton Design Pattern.
    // 3)Private Nested Classes
    // 4) Encapsulation with private
    // 5) Access in Subclasses or Same Package:Private members are not accessible, even in subclasses or classes in the same package.
    public static void main(String[] args) {
        // 1) Private Fields and Methods is completed
        PrivateClass obj = new PrivateClass(12345);
        obj.setValue(54321);
        System.out.println(obj.getValue());
        obj.info();
        // 2)Private Constructors:Private constructors are used to restrict object creation, commonly in the Singleton Design Pattern. is completed
        SingletonClass singletonObj1 = SingletonClass.getInstance();//here ,if object is not there then one object is created ,else No output,object already existed
        SingletonClass singletonObj2 = SingletonClass.getInstance();//No output
        System.out.println(singletonObj1==singletonObj2);//two same objects
        //3)Private Nested Classes is completed
        OuterClass outerClassobj = new OuterClass();
        outerClassobj.display();
        //4)Encapsulation with private is completed
        StudentClass studentClassobj = new StudentClass(10, 12, 123456);
        //write sout to print on screen
        studentClassobj.Account();
        studentClassobj.Id();
        studentClassobj.Reg();

        
    }
}