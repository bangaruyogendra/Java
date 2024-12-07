package Basics.Maths_For_DataStructure;
import java.util.Scanner;
public class Square_Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sqrt_number = sqrt_number(sc.nextInt());
        System.out.println(sqrt_number);
    }
    static int sqrt_number(int n){
        int start =0;
        int end =n;
        while(start<=end){
            int mid = start+(end-start)/2;
            if ((mid*mid)==n){
                
                return mid;
            }
            else if ((mid*mid)>n){
                end = mid-1;
            }
            else{
                start =mid+1;
            }

        }
        return -1;
    }
}
