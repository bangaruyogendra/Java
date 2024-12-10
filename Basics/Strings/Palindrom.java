package Basics.Strings;

public class Palindrom {
    public static void main(String[] args) {
        String name = "abcba";
        //When given string is "ab  cdePsf" then use split(" ") and lowercase
        //In Arrays we use .length because it is reference but in string it is class we can .lenght()

        name.toLowerCase();
        boolean palidrom = palidrom(name);
        System.out.println(palidrom);
       
    }
    static boolean palidrom(String name){
        if (name ==null){
            return true;
        }
        for(int i=0;i<=name.length()/2;i++){
            char start = name.charAt(i);
            char end=name.charAt(name.length()-1-i);
            if ( start!= end){
                return false;
            }
        }
        return true;
    }
}
