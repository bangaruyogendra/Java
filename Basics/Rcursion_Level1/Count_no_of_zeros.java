package Basics.Rcursion_Level1;

import java.util.Scanner;

public class Count_no_of_zeros {
    // count no of zeros in numer for example : 202022222 is 2 zeros
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // clue is if reminder is 0 then count incremented to 1
        count_no_of_zeros(sc.nextInt());
        System.out.println(count);
    }
    static int count=0;
    static void count_no_of_zeros(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        if (rem == 0){
            count +=1;
        }
        count_no_of_zeros(n/10);   
    }

    
}
