package Basics;
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = prime(n);
        if (res){
            System.out.println(n+"is Prime number");
        }
        else{
            System.out.println(n+"is not Prime number");
        }
    }
    public static boolean prime(int num){
        if (num<=1){
            return false;
        }
        int c =2;
        while((c*c)<=num){
            if (num%c ==0){
               return false;
            }
            c+=1;
        }
        return true;
    }
}