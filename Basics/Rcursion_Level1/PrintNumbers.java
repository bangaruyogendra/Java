package Basics.Rcursion_Level1;

import java.util.Scanner;

public class PrintNumbers {
    // taking input from user then print number from n to 1
    //for example user input:5 means 5 4 3 2 1
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        reversenumber(sc.nextInt());
    }
    static void reversenumber(int n){
        if (n<=1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        reversenumber(n-1);
    }
}
