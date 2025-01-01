package Basics.Oops.Basics_Oops;

import java.util.Arrays;

class Test{
     static String name;
     public Test(String name){
        Test.name =name;
     }
}
public class InnerClass {
    static class Test1{
        String name1;
        public Test1(String name1){
           this.name1 =name1;
        }
        @Override
        public String toString(){
            return name1;
        }
   }
    public static void main(String[] args) {
        Test obj =new Test("Balu");
        Test obj1 =new Test("BaluYogi");
        System.out.println(obj.name);
        System.out.println(obj1.name);
        //Here it prints the name which is BaluYogi
        Test1 obj2 =new Test1("Balu1");
        Test1 obj3 =new Test1("Balu1Yogi");
        //Here it static class inside innerclass
        System.out.println(obj2.name1);
        System.out.println(obj3.name1);
        Arrays.toString(new int[]{1,2,3});
        //toString method is static we can access throught the Arrays Class
    


    }
}
