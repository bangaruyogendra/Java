package Basics.Rcursion_Level1;

public class Factoial_Number {
    //Factorial Number using Recursion
    public static void main(String[] args) {
        int res =fac(5);
        System.out.println(res);
    }
    static int fac(int n){
        if (n<=0){
            return 1;
        }
        return n*fac(n-1);
    }
}
