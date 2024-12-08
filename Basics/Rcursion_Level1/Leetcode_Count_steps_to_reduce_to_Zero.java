package Basics.Rcursion_Level1;

import java.util.Scanner;

public class Leetcode_Count_steps_to_reduce_to_Zero {
    //description:questions states that if number is even then divided number by 2 and count incremented to 1 else the number substract by 1 count incremented to 1 return count 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        count_step_to_zero(sc.nextInt());
        System.out.println(count);
    }
    static int count=0;
    static void count_step_to_zero(int n){
       if (n==0) {
        return;
       }
       if (n%2==0){
           count+=1;
           count_step_to_zero(n/2);
       }
       else{
        
        count+=1;
        count_step_to_zero(n-1);
       }
    }
}
