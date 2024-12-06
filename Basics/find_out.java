package Basics;

public class find_out {
    public static void main(String[] args) {
        //Find out number which not repeated
        //Do XOR operation 1^1 =0 and 1^0 =1 and 0^1 =1 and 0^0=0
        //int arr[] ={1,3,1,4,4,5,3};
        int arr[] = {-1,3,-3,4,1};
        int res = not_Repeated(arr);
        System.out.println(res);
    }
    static int not_Repeated(int[] arr){
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
