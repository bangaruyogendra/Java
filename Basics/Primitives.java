package Basics;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // these are primivate data types 


        // integer input from user
        System.out.print("Enter integer input:");
        //size of int is 4bytes
        // int num = 200_00_00 it will print as 2000000
        int num = input.nextInt();
        System.out.println(num);
        
        System.out.println("This is Charater");
        //size of charater is 2bytes
        char ch = 'f';
        System.out.println(ch);

        System.out.print("Enter float input:");
        //size of float is 4bytes
        //float 999.2f
        float f = input.nextFloat();
        System.out.println(f);

        System.out.print("Enter double input:");
        //size of double is 8bytes
        double d = input.nextDouble();
        System.out.println(d);

        System.out.print("Enter Long input:");
        //size of Long is 8bytes
        //long 9999999L
        long l = input.nextLong();
        System.out.println(l);

        System.out.println("this is boolean");
        //size of boolean is 1bytes
        boolean b = false;
        System.out.println(b);

        //this is wrapper class it gives extre features for example
        //parseInt can covert string to int
        String num1 = "40";
        Integer.parseInt(num1);
        //toString can convert int to String
        int num2 =40;
        Integer.toString(num2);


        //type casting pressing bigger number into smaller number for example
        System.out.println("This is type casting");
        int cast = (int)(23.45f);
        System.out.println(cast);

         //narrow casting pressing smaller number into bigger number for example
         System.out.println("This is narrow casting");
         int ca = (int)(23.45f);
         System.out.println(ca);

         //Automatic type promotion 
         //byte can store upto 256 to -256
         // this result of code will be reaminder of 257%256 == 1
         int num3 = 257;
         byte by = (byte)(num3);
         System.out.println(by);

         //when ever doing operations * or + or - it automatically convert into int for example
         //byte b =40;
         //b = b*2

         byte b1 =42;
         char a = 'a';
         short s = 1024;
         int i =200000;
         float f1= 20.3f;
         double d1 = 2000.343;
         double res = ((f1*b1)+(i/a)-(d1-s));
         System.out.println((f1*b1)+" "+(i/a)+" "+(d1-s));
         System.out.println(res);
        

         //if condition can also excute condition is true for example 
        //if (false){
            //System.out.println("Hello");
        //}

        // if you convert tempc to tempf then use this ((tempc* 9/5)+32) for tempf



    }
}
