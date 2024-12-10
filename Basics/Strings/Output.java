package Basics.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
    
        //println method calls valueof fun this one call toString methods means everything we write in println is converted into string
        // System.out.println(56);
        // System.out.println("Kunal");
        // System.out.println(new int[]{1,2,3,4,5,6});
        // System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6}));
        //Pritty printing
        // System.out.printf("formatted number is %.2f\n",23.22233);
        // // use this for nextline in printf "\n"

        // System.out.printf("My name is %s and i am Learning %s","Balu","DSA");
        //a is 97 according AIISC using operation
        System.out.println('a'+'b');
        System.out.println("ab");
        //type casting 
        System.out.println((char)('a'+3)); //it print d
        System.out.println("balu"+1);// it converts into string prints balu1 and 1 automatically converted to string
        System.out.println("balu"+new ArrayList<>()); // it returns balu[]
        //System.out.println(new int[]{1,2,3,4,5,6} + new ArrayList<>()); it not work because it not contains " "

    }
}
