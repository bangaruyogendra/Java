package Basics.Access_Controls;

public class PrivateClass {
    private long account_number;
    public PrivateClass(long account_number){
        this.account_number =account_number;
    }
    public long getValue(){
        return this.account_number;
    }
    public long setValue(long account_number){
        return this.account_number =account_number;
    }
    private void msg(){
        System.out.println("This is private class"+" "+ getValue());
    }
    public void info(){
       msg();
    }
}
