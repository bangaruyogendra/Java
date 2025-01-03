package Basics.Access_Controls;

public class StudentClass {
    private int id;
    private int reg;
    private long account_number;
    public StudentClass(int id,int reg,long account_number){
        this.id =id;
        this.reg=reg;
        this.account_number=account_number;
    }
    private int getId(){
        return this.id;
    }
    private int getReg(){
        return this.reg;
    }
    private long get_Account_Number(){
        return this.account_number;
    }
    public int setId(int id){
        return this.id = id;
    }
    public int setReg(int reg){
         return this.reg =reg;
    }
    public long setAccountNumber(long account_number){
        return this.account_number=account_number;
    }

}
