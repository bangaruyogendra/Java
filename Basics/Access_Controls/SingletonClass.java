package Basics.Access_Controls;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){
        System.out.println("Singleton class is created");
    }
    public static SingletonClass getInstance(){
        if(instance ==null){
            instance =new SingletonClass();
        }
                return instance;
    }
}
