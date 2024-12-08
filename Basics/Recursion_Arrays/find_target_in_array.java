package Basics.Recursion_Arrays;

import java.util.ArrayList;

public class find_target_in_array {
    //Description : question states find the target element in array for Example :[1,3,4,5,6,7] target : 4 return res is index 2 else return -1
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,4,5,9,8};
        int target = 4;
        int res = index_of_target_elment(arr,target,0);
        System.out.println(res);
        findallIndex(arr,target,0);
        System.out.println(list);
    }
    static int index_of_target_elment(int[] arr,int target,int index){
          int ans = -1;
          if(index == arr.length){
              return ans;
          }
          if (arr[index]==target){
              ans = index;
              return ans;
          }
          return index_of_target_elment(arr,target,index+1);
    }
    static ArrayList<Integer> list =new ArrayList<>();
    static void findallIndex(int[] arr,int target,int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findallIndex(arr,target,index+1);
    }

}
