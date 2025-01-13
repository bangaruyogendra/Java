package Basics.LinkedList;

public class LinkedListCustome {
    private Node head;
    private Node tail;
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
    public void insertFirst(int value){
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
    public void insertLast(int value){
      Node node = new Node(value);
      if(head == null){
        head = node;
      }
      Node temp =head;
      while(temp.next!=null){
        temp = temp.next;
    }
    temp.next = node;
    this.size+=1;

    }
    public void insert(int index,int value){
        
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size)
        {
            insertLast(value);
            return;
        }
        Node temp =head;
        for(int e = 1;e<index-1;e++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        this.size+=1;

    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("Linked list is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        //Node temp = head;
        // while(temp.next.next!=null){
        //     temp =temp.next;
        // }
        // temp.next=null;
        Node secNode = getNode(size-1);
        secNode.next = null;
        this.size-=1;
    }
    public void deleteMiddle(int index){
       if(index == 0){
        deleteFirst();
        return;
       }
       if(index == size){
        deleteLast();
        return;
       }
       Node temp = head;
       for(int e =1;e<index-1;e++){
        temp = temp.next;
       }
       temp.next = temp.next.next;
       this.size-=1;
    }
    public Node getNode(int index){
        Node temp =head;
        for(int e =1;e<index-1;e++){
            temp =temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        LinkedListCustome list= new LinkedListCustome();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
        list.insertLast(50);
        list.display();
        list.insert(3,60);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteMiddle(2);
        list.display();

    }
}
