package Basics.Oops.Basics_Oops.Generic_ArrayList_Concept;

public class GenericCustome_ArrayList<T> {
    private Object[] arr;
    private int data =0;
    private static int Default=5;
    public GenericCustome_ArrayList(){
        arr = new Object[Default];
    }
    public void add(T value){
        if(isFull()){
            resize();
        }
        arr[data++] = value;
    }
    public boolean isFull(){
        return arr.length == Default;
    }
    public void resize(){
      Object[] temp = new Object[arr.length*2];
      for(int i = 0;i<arr.length;i++){
        temp[i] =arr[i];
      }
      arr = temp;
    }
    public T remove(){
        return (T)arr[--data];
    }
    public void set(int size,T value){
        arr[size] =value;
    }
    public void display(){
        for(int i =0;i<data;i++){
            System.out.println(arr[i]);
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        GenericCustome_ArrayList Custome = new GenericCustome_ArrayList<>();
        Custome.add("Balu");
        Custome.add("Yogi");
        Custome.add("Balu");
        Custome.add("Yogi");
        Custome.add("Balu");
        Custome.add("Yogi");
        Custome.display();
        Custome.remove();
        System.out.println("After removing");
        Custome.display();
        Custome.set(0,"Balu Yogendra");
        System.out.println("Modifying the Array");
        Custome.display();
        //public class GenericMethodExample {
    // Generic method
//     public static <T> void display(T element) {
//         System.out.println("Element: " + element);
//     }

//     public static void main(String[] args) {
//         display("Hello, World!");
//         display(42);
//         display(3.14);
//     }
// }
// Generic interface


























    }
    
}
