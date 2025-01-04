package Basics.Oops.Basics_Oops;

public class AbstractClassMain {
    public static void main(String[] args) {
        DoctorAbstract docObj =new DoctorAbstract(10);
        docObj.work();
        docObj.displayReg();
        HumanAbstract patObj= new PatientAbstract(10);
        patObj.displayReg();
        HumanAbstract.displayId();
        
    }
}
