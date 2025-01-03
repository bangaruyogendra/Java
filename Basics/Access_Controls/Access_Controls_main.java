package Basics.Access_Controls;

import Basics.Oops.Basics_Oops.StudentClass;

public class Access_Controls_main extends StudentClass {
    //protected access modifier is explained here 
    //accessing student present in Oops 
    int reg;
    public Access_Controls_main(int id,int reg){
        super(id);
        this.reg=reg;
    }
    public void info(){
        System.out.println("Id of Student:"+super.id+ " " +"reg of Student:"+reg);
    }
    public static void main(String[] args) {
        Access_Controls_main mainobj = new Access_Controls_main(10, 10);
        mainobj.info();
    }
}
