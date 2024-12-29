package Basics.Recursion_Strings;

import java.util.ArrayList;
import java.util.Scanner;
public class Letter_Combination_of_Letter {
    //for example given string "23" then return {ad,ae,af,bd,be,bf,cd,ce,cf}
    public static void main(String[] args) {
        String name = "12";
        letters(" ",name);
        //Using ArrayList store the result
        ArrayList<String> li = letterRet(" ",name);
        System.out.println(li);



    }
    static void letters(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int num = up.charAt(0)-'0';
        
        for(int i=(num-1)*3;i<num*3;i++){
            char ch = (char)('a'+i);
            letters(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> letterRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> ans =new ArrayList<>();
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch =(char)('a'+i);
            ans.addAll(letterRet(p+ch, up.substring(1)));
        }
        return ans;
    }
}
