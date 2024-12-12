package Basics.Recursion_Strings;

import java.util.ArrayList;

public class Subset_Pattern {
    //Subset pattern is knowning as adding and removing elements
    //for example : Str = "abc" permutations of this str is {a,b,c,ab,ac,bc,abc,{"Empty set"}}
    //2^(no of charaters in str) for example given above str is 8 subsets
    public static void main(String[] args) {
        String str = "abc";
        //subsets_of_str(" ",str);
        ArrayList<String> subsets  = subsets_of_str(" ",str);
        System.out.println(subsets);
        
    }
    // 
    static ArrayList<String> subsets_of_str(String up,String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        char ch =str.charAt(0);
        ArrayList<String> left = subsets_of_str(up+ch, str.substring(1));
        ArrayList<String> right = subsets_of_str(up, str.substring(1));
        left.addAll(right);
        return left;
    }
}
