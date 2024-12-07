package Basics.Maths_For_DataStructure;

public class Prime_number {
    //Prime Numbers
    public static void main(String[] args) {
        int n =15;
        // for (int i =2;i<=n;i++){
        //     System.out.println(i +" "+isPrime(i));
        // }
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n){
            
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        // boolean primes[] = new boolean[n+1];
        // for(int i=2;i*i<=n;i++){
        //     if (!primes[i]){
        //       for (int j=i*2;j<=n;j+=i){
        //         primes[j]=true;
        //       }
        //     }
        // }
        // for(int i=2;i<primes.length;i++){
        //     System.out.println(i +" "+primes[i]);
        // }
    
        }
}
