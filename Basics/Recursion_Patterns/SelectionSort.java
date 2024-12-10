package Basics.Recursion_Patterns;

import java.util.Arrays;

public class SelectionSort {
    //Selection Sort for example {4,3,1,2}
    //step 1 : pick the largest element in array and swap it with last element
    //step 2 : after done step 1 and reduce the array length by 1 
    //step 3:repeat the step 1
    public static void main(String[] args) {
       int arr[] = {4,3,1,2};
       int r =arr.length;
       selectionSort(arr,r,0,0);
       System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int r,int c,int max){
         if(r==1){
            return;
         }
         if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr, r, c+1, c);
            }
            else{
                selectionSort(arr, r, c+1, max);  
            }
         }
         else{
            int temp = arr[max];
            arr[max] =arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
         }
    }
}
