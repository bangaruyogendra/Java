package Basics.Oops.Basics_Oops;

public class PolymorphismMain  {
    //Compile time Polymorphism means achived using method overloading 
    //same name with different types of arguments,return,ording can be different
    //for example : 1)A obj = new A() 2) A =obj = new A(1,2)
    //when u write final keyword infront of method then method is resistedand it should not be overrided 
    public static void main(String[] args) {

        PolymorphismShapes shapesobj = new PolymorphismShapes();
        shapesobj.area();
        Circle circleobj = new Circle();
        circleobj.area();
        //overriding means method overrided which from PolymorphismShapes to traingle
        PolymorphismShapes polyshapesref = new Traingle();
        polyshapesref.area();
        //this below selections dicuss obout the overloading
        Numbers numobj = new Numbers();
        //sum function with int,int
        System.out.println(numobj.sum(1, 2));
        //sum function with int,int,int
        System.out.println(numobj.sum(1,2,3));
        //sum function with double,double
        System.out.println(numobj.sum(1.0,2.0));
        //sum function with double,int
        System.out.println(numobj.sum(1.0, 3));
        //sum function with int,double
        System.out.println(numobj.sum(1,10.0));
        
    }
}
