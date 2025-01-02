package Basics.Oops.Basics_Oops;
public class Main extends Inheritence{
    int weigth;
    public Main(int l,int b,int w,int weigth){
        super(l,b,w);//this super is used for initalied the parent class 
        this.weigth=weigth;

    }
    public Main(Main other){
      super(other);
      weigth = other.weigth;
    }
    
    public static void main(String[] args) {
        //Inheritence obj =new Inheritence(4);
        //System.out.println(obj.b+" "+obj.l+" "+obj.h);
        Main Mainobj = new Main(1, 1, 1,10);
        System.out.println(Mainobj.b+" "+Mainobj.l+" "+Mainobj.h+" "+Mainobj.weigth);
        Inheritence box =new Main(1, 2, 3, 10);
        System.out.println(box.h);
        //here access private staff weight
        Mainobj.getW();
    
        //System.out.println(box.weight); here cant access the child properties with ref of super or base class
        //Main obj = new Inheritence(1, 1, 1);here it is wrong cant access with obj
    
    }
}
