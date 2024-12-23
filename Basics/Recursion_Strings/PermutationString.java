package Basics.Recursion_Strings;

import java.util.Scanner;

public class PermutationString {
    //permutations Example :given string abc answer should be abc,acb,bca,bac,cba,cab
    //for given string abc have 3 characters then 3! have permutations
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =  sc.next();
        permutate("",name);
    
    }
    static void permutate(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            permutate(f+ch+s, up.substring(1));
        }
    }
}
