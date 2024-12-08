package Basics.Rcursion_Level1;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        //Reverse the Number
        Scanner sc =new Scanner(System.in);
        int res =rev2(sc.nextInt());
        System.out.println(res);
    }
    // static void rev(int n){
    //     if (n==0){
    //         return;
    //     }
    //     int rem = n%10;
    //     sum = sum*10+rem;
    //     rev(n/10);
    // }
    static int rev2(int n){
       int digits = (int)(Math.log10(n))+1;
       return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10 ==n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10, digits-1)+helper(n/10, digits-1));
    }
}
