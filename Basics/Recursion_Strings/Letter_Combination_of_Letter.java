package Basics.Recursion_Strings;

import java.util.ArrayList;
import java.util.Scanner;
public class Letter_Combination_of_Letter {
    //for example given string "23" then return {ad,ae,af,bd,be,bf,cd,ce,cf}
    public static void main(String[] args) {
        String name = "12";
        letters(" ",name);

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
}
