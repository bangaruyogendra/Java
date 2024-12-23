package Basics.Recursion_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Letter_Combination_of_Letter {
    //for example given string "23" then return {ad,ae,af,bd,be,bf,cd,ce,cf}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> li = new ArrayList<>();
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           int num = ch-'0';
           switch (num) {
            case 1:
                break;
           
            case 2:
                li.add("abc");
                break;
            case 3:
                li.add("def");
                break;
           }
        }
        letter_combinations(li);

    }
    static void letter_combinations(ArrayList<String> str){
        ArrayList<String> ans = helper(str.get(0),str.get(1));
        System.out.println(ans);
    }
    static ArrayList<String> helper(String up,String down){
        if()
    }
}
