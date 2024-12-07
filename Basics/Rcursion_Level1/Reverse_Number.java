package Basics.Rcursion_Level1;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        //Reverse the Number
        Scanner sc =new Scanner(System.in);
        rev(sc.nextInt());
        System.out.println(sum);
    }
    static int sum=0;
    static void rev(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        rev(n/10);
    }
}
