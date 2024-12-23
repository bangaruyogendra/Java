package Basics.Recursion_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationString {
    //permutations Example :given string abc answer should be abc,acb,bca,bac,cba,cab
    //for given string abc have 3 characters then 3! have permutations
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =  sc.next();
        permutate("",name);
        ArrayList<String> ans = permutateList(" ", name);
        System.out.println(ans);
    
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
    static ArrayList<String> permutateList(String up,String name){
        if(name.isEmpty()){
            ArrayList<String> li =new ArrayList<>();
            li.add(up);
            return li;
        }
        char ch = name.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=up.length();i++){
            String f = up.substring(0,i);
            String s = up.substring(i,up.length());
            ans.addAll(permutateList(f+ch+s, name.substring(1)));
        }
        return ans;
    }
}
