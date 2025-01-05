package Basics.Oops.Basics_Oops.Generic_ArrayList_Concept;

public class Custome_ArrayList {
    private int arr[];
    private int data = -1;
    private int Default = 5;
    
    public Custome_ArrayList(){
       
        this.arr = new int[Default];
    }
    public void add(int num){
        if (isFull()){
           this.arr = new int[Default*2];
        }
        arr[++data] = num;
    }
    public boolean isFull(){
        if (data == Default){
            return true;
        }
        return false;
    }
    public void display(){
        for(int e=0;e<arr.length;e++){
           System.out.println(arr[e]);
        }
    }
    public static void main(String[] args) {
        Custome_ArrayList arrObj = new Custome_ArrayList();
        arrObj.add(2);
        arrObj.add(3);
        arrObj.add(4);
        arrObj.add(5);
        arrObj.add(6);
        arrObj.add(7);
        arrObj.display();

    }

}
