package Basics.Oops.Basics_Oops;

class ProtectedCLass {
    //this protected class within  same package
    //Protected Members Are Not Directly Accessible Without Inheritance (Different Package)
    protected int age;
    public ProtectedCLass(int age){
        this.age =age;
    }
    protected void msg(){
       System.out.println(age);
    }

}
public class subProtected extends ProtectedCLass{
    public subProtected(int age){
        super(age);
    }
    void info(){
      msg();
    }
}
