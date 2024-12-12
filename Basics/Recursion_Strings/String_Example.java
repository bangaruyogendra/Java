package Basics.Recursion_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class String_Example{
    //for example String str = "baccad" and ans = "bccd" using recursion
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
          String str = "abappleba";
        //String str  = sc.next();
        //String ans = basic_String(" " ,str);
        //String str1 = skip(str);
        skipApple(str);
        }

            // static void basic_string(String p,String up){
            //     if (up.isEmpty()){
            //         System.out.println(p);
            //         return;
            //     }
            //     char ch = up.charAt(0);
            //     if(ch == 'a'){
            //       basic_string(p,up.substring(1));
            //     }
            //     else{
            //       basic_string(p+ch,up.substring(1)); 
            //     }
            // }
        
            // static String skip(String str) {
            //     if(str.isEmpty()){
            //         return " ";
            //     }
            //     char ch = str.charAt(0);
            //     if(ch == 'a'){
            //         return skip(str.substring(1));
            //     }
            //     else{
            //         return ch+skip(str.substring(1));
            //     }
            // }
            static void skipApple(String str){
                if(str.isEmpty()){
                    return;
                }
                if(str.startsWith("apple")){
                    skipApple(str.substring(5));
                }
                else{
                    System.out.print(str.charAt(0));
                    skipApple(str.substring(1));
                }
            }
    
}