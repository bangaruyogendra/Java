package Basics.Oops.Basics_Oops;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,double b){
        return a+b;
    }
    double sum(double a,int b){
        return a+b;
    }
    int sum(int a,double b){
       //add casting from double to int
       return (int)(a+b);
    }
}
