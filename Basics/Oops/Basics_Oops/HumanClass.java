package Basics.Oops.Basics_Oops;

public class HumanClass {
     int id;
     String name;
     static int num=0;
     static void msg(){
      System.out.println("This is static method");
      //System.out.println(this.id); here cant use non static variable inside the static method
      //here static method first
     }
     public HumanClass(int id,String name){
        this.id =id;
        this.name =name;
        HumanClass.num+=1;
        HumanClass.msg();
     }
     
}
