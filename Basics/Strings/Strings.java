package Basics.Strings;

public class Strings {
    //Note : String are stored in pool inside heap 
    //if more reference created with same object if one reference change the object then it cannot change other reference because immutabiliity unlike arrays
    public static void main(String[] args) {
        String a ="Balu";
        String b = "Balu";
        //these two references refers to same object
        System.out.println(a==b);
        //how to created new object for string
        String c ="Yogendra";
        System.out.println(c);
        c = "Balu";
        System.out.println(c);
        // these two reference refers to two difference object
        String d = new String("Reddy");
        String e = new String("Reddy");
        System.out.println(d==e);
        //equals methods care about value it return true
        System.out.println(d.equals(e));
        //for class object we get access the charater using charAt()
        System.out.println(d.charAt(0));
        
    }
}
