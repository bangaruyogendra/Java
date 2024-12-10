package Basics.Recursion_Patterns;

import java.util.Scanner;

public class Star_Patterns {
    //Description for this contains all Star patterns
    //Draw reversed right angle traingle
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        printRightAnglePattern(r,c);

    }
    static void printRightAnglePattern(int r,int c){
        // if (r==0){
        //     return;
        // }
       
        // if (c>0){
        //     System.out.print("*"+" ");
        //     printRightAnglePattern(r, c-1);
        // }
        // if (c==0){
        //     System.out.println();
        //     printRightAnglePattern(r-1,r-1);
        //     here u can use this above printRightAnglePattern(r-1,r-1); or printRightAnglePattern(r,c);
        //     r = r-1;
        //     c = r;
        //     printRightAnglePattern(r,c);
        // }
        //
        //     if (r==0){
            //     return;
            // }
           
            // if (c<r){
            //     System.out.print("*"+" ");
            //     printRightAnglePattern(r, c-1);
            // }
            // else{
            //     System.out.println();
            //     printRightAnglePattern(r-1,0);
            //     
            // }
        for (int i = r;i>0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
