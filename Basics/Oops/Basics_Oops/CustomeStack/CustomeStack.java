package Basics.Oops.Basics_Oops.CustomeStack;

import java.util.Stack;

public class CustomeStack<T> {
    private int data=0;
    private static int Default=5;
        private Object arr[];
        public CustomeStack(){
           arr= new Object[Default];
        }
        public void push(T value){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[data++] = value;
        }
        private boolean isFull(){
            if(arr.length == Default){
                return false;
            }
            return true;
        }
        public T pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            return (T)arr[--data];
        
        }
        private boolean isEmpty(){
           if(arr.length == 0){
                return true;
           }
           return false;
        }
        public void display(){
            for(int e=0;e<data;e++){
                System.out.println(arr[e]);
            }
            System.out.println();
        }
        
    

    public static void main(String[] args) {
        CustomeStack<Integer> st =new CustomeStack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        st.display();
        
    }
}
