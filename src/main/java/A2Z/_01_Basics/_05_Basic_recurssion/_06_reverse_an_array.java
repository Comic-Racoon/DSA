package A2Z._01_Basics._05_Basic_recurssion;

import java.util.Arrays;

public class _06_reverse_an_array {
/*
    Input: N = 5, arr[] = {5,4,3,2,1}
    Output: {1,2,3,4,5}
    Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
                 the second element occupies the fourth position and so on.
 */
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        reverse_Array(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse_Array(int[] arr, int start, int end){
        if(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse_Array(arr, start+1, end-1);
        }
    }
}
