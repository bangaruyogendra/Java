package Basics;

public class Odd_number {
    public static void main(String[] args) {
        int num =67;
        boolean ans = odd_Num(num);
        System.out.println(ans);
    }
    //isOdd means (n&1)==1
    //isEven means (n&1)==0
    static boolean odd_Num(int n){
        return ((n&1)==1);  
    }
}
