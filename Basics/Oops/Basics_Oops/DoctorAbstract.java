package Basics.Oops.Basics_Oops;

public class DoctorAbstract extends HumanAbstract {
    public DoctorAbstract(int age){
        super(age);
    }
    @Override
    void work() {
        System.out.println("I am Working as doctor in hosptial");
    }
    @Override
    void displayReg(){
        System.out.println("Doctor Reg Id is 123");
    }

    

    
}
