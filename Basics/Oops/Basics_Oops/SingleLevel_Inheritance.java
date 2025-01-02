package Basics.Oops.Basics_Oops;

public class SingleLevel_Inheritance extends Main {
    int cost;
    public SingleLevel_Inheritance(int l,int b,int w,int weigth,int cost){
        super(l, b, w, weigth);
        this.cost = cost;
    }
    public SingleLevel_Inheritance(SingleLevel_Inheritance other){
        super(other);
        cost=other.cost;
    }
        //2)multiland Inheritance means class extends other extends other extends other
        //1)singlelevel Inheritance means class extends other class
        //3)multiple Inheritance means two class extends same class
        //4)heraricial Inheritance means one class is inherited by many classes
        //5)hybrid Inheritance means combine of single and multiple Inheritance
    public static void main(String[] args) {
        SingleLevel_Inheritance singlelevelobj = new SingleLevel_Inheritance(10, 10, 10, 10, 20);
        System.out.println("Inheritance obj:"+singlelevelobj.b+" "+"Weight property from Main class"+singlelevelobj.weigth+" "+"cost property from SingleInheritance"+singlelevelobj.cost);
        SingleLevel_Inheritance obj = new SingleLevel_Inheritance(singlelevelobj);
        System.out.println("Inheritance obj:"+obj.b+" "+"Weight property from Main class"+obj.weigth+" "+"cost property from SingleInheritance"+singlelevelobj.cost);
    }
}
