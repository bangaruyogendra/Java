package Basics.Access_Controls;

public class OuterClass {
    private class InnerClass{
        private int age=10;
        private int display(){
            return age;
        }
        public void info(){
            display();
        }
    }
    public void display(){
        InnerClass Innerobj = new InnerClass();
        Innerobj.info();
    }
}
