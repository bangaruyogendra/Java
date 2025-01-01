package Basics.Oops.Basics_Oops;

public class Static_Int {
    //only once static method initied when class is decleared 
    static int a=10;
    static int b;
    static{
       System.out.println("This is static method");
       b = a*10;
    }
    public static void main(String[] args) {
        Static_Int obj =new Static_Int();
        System.out.println(Static_Int.a+" "+Static_Int.b);
        Static_Int.b+=3;
        System.out.println(Static_Int.a+" "+Static_Int.b);
        Static_Int obj1 =new Static_Int();
        System.out.println(Static_Int.a+" "+Static_Int.b);
    }
    
}
