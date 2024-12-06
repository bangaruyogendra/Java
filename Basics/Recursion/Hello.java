package Basics.Recursion;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Fabanacci Number");
        int res = Fabanacci(5);
        System.out.println(res);
    }
    static int Fabanacci(int n){
        if (n<=0){
          return 0;
        }
        if (n==1){
            return 1;
        }
        return Fabanacci(n-1)+Fabanacci(n-2);
    }
    
}
