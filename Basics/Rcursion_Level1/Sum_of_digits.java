package Basics.Rcursion_Level1;

import java.util.Scanner;

public class Sum_of_digits {
    //Sum of Digits using Recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number String:");
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        int res = sum_of_digits(n);
        System.out.println(res);
    }
    static int sum_of_digits(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10)+sum_of_digits(n/10);
        

    }
}
