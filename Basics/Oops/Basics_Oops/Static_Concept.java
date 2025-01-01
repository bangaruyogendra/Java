package Basics.Oops.Basics_Oops;

public class Static_Concept {
    //here we concluded that static does not need obj to create
    public static void main(String[] args) {
        HumanClass obj = new HumanClass(5,"Balu");
        HumanClass obj1 = new HumanClass(5,"Balu");
        System.out.println(HumanClass.num);
        System.out.println(HumanClass.num);
        //greeting(); you cannot use this because it requires instances
        hello();
    

    }
    static void hello(){
        //greeting();you cannot use this because it requires instances
        //but this function not depands upon instance
        //we cannot referring thier instance the non static content in static 
        Static_Concept obj = new Static_Concept();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello,World!");
        fun();
    }
    void fun(){
        System.out.println("this is fun");
    }
}
