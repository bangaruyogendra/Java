package Basics.Recursion_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_array_is_Sorted_or_not {
    //Description for this question to find array is sorted or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from an array
        ArrayList<Integer> arr =new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        boolean ans = array_sorted_or_not(arr);
        System.out.println(ans);
    }
    static boolean array_sorted_or_not(ArrayList<Integer> arr){
        return helper(arr,0);
    }
    static boolean helper(ArrayList<Integer> arr,int index){
        if (index == arr.size()-1){
            return true;
        }
        if(arr.get(index) > arr.get(index+1)){
            return false;
        }
        return helper(arr, index+1);
    }
}
