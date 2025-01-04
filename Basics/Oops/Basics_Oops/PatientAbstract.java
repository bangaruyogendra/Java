package Basics.Oops.Basics_Oops;

public class PatientAbstract extends HumanAbstract {
    public PatientAbstract(int age){
        super(age);
    }
    @Override
    void work() {
       System.out.println("I am working on curing");
    }

    @Override
    void displayReg(){
       System.out.println("Patient Reg Id is :321");

    }
    
}
