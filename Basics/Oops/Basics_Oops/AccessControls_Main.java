package Basics.Oops.Basics_Oops;

public class AccessControls_Main {
    //protected access can be demostrated within same package
    //Protected Members Are Not Directly Accessible Without Inheritance (Different Package)
    //Protected Members and Inheritance (Different Package)
    //Protected Members and Inheritance (Same Package)
    //Protected Members in the Same Package
     public static void main(String[] args) {
        ProtectedCLass protectedobj = new ProtectedCLass(10);
        protectedobj.msg();
        subProtected subProtectedobj = new subProtected(20);
        subProtectedobj.info();
     }

}
