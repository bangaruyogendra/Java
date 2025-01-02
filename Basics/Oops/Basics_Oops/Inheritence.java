package Basics.Oops.Basics_Oops;

public class Inheritence {
    int l;
    int b;
    int h;
    private int w;
    public Inheritence(){
        this.l=0;
        this.b=0;
        this.h=0;
    }
    public Inheritence(int side){
        this.l =side;
        this.b=side;
        this.h=side;

    }
    public Inheritence(int l,int b,int h){
        System.out.println("Inheritence class is running");
        this.l =l;
        this.b=b;
        this.h=h;

    }
    public Inheritence(Inheritence old){
        this.l =old.l;
        this.b=old.b;
        this.h=old.h;
    }


    public void info(){
        System.out.println("Running the Box");
    }
    public int getW(){
        return w;
    }
}
