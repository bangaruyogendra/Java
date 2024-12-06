package Basics.Recursion;
import java.util.Arrays;


public class Binary_Search {
     //Binary Search using Recursion
    public static void main(String[] args) {
        int arr[] = {9,8,6,7,5,4,3,2,1};
        Arrays.sort(arr);
        boolean ans = Binary_Search(0,arr,0,arr.length-1);
        if (ans){
            System.out.println("element is Found");
        }
        else{
            System.out.println("element is not Found");
        }
        
    }
    static boolean Binary_Search(int target,int[] arr,int left,int right){
        if (left>right){
            return false;
        }
        int mid = left+(right-left)/2;
        
        if (target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
            Binary_Search(target, arr, left, mid-1);
        }
        else{
            Binary_Search(target, arr, mid+1, right);
        }
        return false;
            
         
    }
}
