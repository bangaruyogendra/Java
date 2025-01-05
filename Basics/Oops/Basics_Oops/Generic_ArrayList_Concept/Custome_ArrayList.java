package Basics.Oops.Basics_Oops.Generic_ArrayList_Concept;

public class Custome_ArrayList  {
    private int arr[];
    private int data = 0;
    private static int Default = 5;
    
    public Custome_ArrayList(){
       
        this.arr = new int[Default];
    }
    public void add(int num){
        if (isFull()){
           resize();
        }
        arr[data++] = num;
    }
    public int remove(){
        if(data ==0){
            System.out.println("ArrayList is Empty");
        }
        return arr[--data];

    }
    public boolean isFull(){
        if (arr.length == Default){
            return true;
        }
        return false;
    }
    public void display(){
        for(int e=0;e<data;e++){
           System.out.println(arr[e]);
        }
    }
    public void resize(){
        int temp[] = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr = temp;
    }
    public void set(int index,int value){
        arr[index]=value;
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
        arrObj.remove();
        System.out.println("Custome ArrayList after removing");
        arrObj.display();
        System.out.println("Modifying an array");
        arrObj.set(0, 5);
        arrObj.display();

    }

}
