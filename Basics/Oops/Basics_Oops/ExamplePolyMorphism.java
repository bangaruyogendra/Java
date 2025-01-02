package Basics.Oops.Basics_Oops;

public class ExamplePolyMorphism {
    int num;
    public ExamplePolyMorphism(int num){
        this.num =num;
    }
    @Override
    public String toString(){
        return "Number should be:"+num;
    }
    public static void main(String[] args) {
        ExamplePolyMorphism obj =new ExamplePolyMorphism(10);
        //toString methods here
        System.out.println(obj);
        //created toString method overrided here

    }
}
