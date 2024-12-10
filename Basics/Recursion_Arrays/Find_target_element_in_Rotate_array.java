package Basics.Recursion_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_target_element_in_Rotate_array {
    //Description for question find target index in rotated array for example arr =[5,6,7,8,1,2,3],target = 7
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println("Enter the array elements (space-separated):");
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (String str : input) {
            arr.add(Integer.parseInt(str));
        }

        sc.close();
        int found = target_index_of_rotated_array(arr,target,0,arr.size()-1);
        System.out.println(found);

    }
    static int target_index_of_rotated_array(ArrayList<Integer> arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start + (end-start))/2;
        if (arr.get(mid)==target){
            return mid;
        }
        else if(arr.get(start)<=arr.get(mid)){
            if(target>=arr.get(start) && target<arr.get(mid)){
                return target_index_of_rotated_array(arr,target,start,end-1);
            }
            else {
                return target_index_of_rotated_array(arr, target, mid + 1, end);
            }
        }
        else{
            if(target>arr.get(mid) && target<=arr.get(end)){
                return target_index_of_rotated_array(arr,target,mid+1,end);
            }
            else {
                return target_index_of_rotated_array(arr, target, start, mid - 1);
            }
        }


    }
}
