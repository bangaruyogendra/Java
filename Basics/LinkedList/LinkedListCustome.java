package Basics.LinkedList;

public class LinkedListCustome {
    private Node head;
    private int size;
    class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data=data;
        }
    }
    public LinkedListCustome(){
        this.size=0;
    }
    public void addFirst(int value){
        //Here adding the node 30 ->20 ->10
        Node node = new Node(value);
        node.next=head;
        head = node;
        this.size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListCustome list= new LinkedListCustome();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.display();
    }
}
