package Basics.Recursion_Patterns;

import java.util.Arrays;

public class bubbleSort {
    // Bubble sort given arr[] = {4,3,1,2}
    // {3,4,1,2}
    // {3,1,4,2}
    // {3,1,2,4}
    // this is after first iteration
    public static void main(String[] args) {
        int arr[] ={4,3,1,2};
        int l =arr.length-1;
        bubbleSort(arr,l,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr,int r,int c){
        if (r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
            //swap the elements in array
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] =temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }
}
