package A2Z._02_Imp_Sorting_Techniques._01_Sorting_I;

public class _01_Selection_Sort {
/*
    {
        you "select" the smallest element in array move it to front;
    }
    The algorithm steps are as follows:

    -> First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the
       range.
    -> The loop will run forward from 0 to n-1. The value i = 0 means the range is from 0 to n-1, and similarly, i = 1
       means the range is from 1 to n-1, and so on.
       (Initially, the range will be the whole array starting from the first index.)
    -> Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.
       After that, we will swap the minimum element with the first element of the selected range(in step 1).
    -> Finally, after each iteration, we will find that the array is sorted up to the first index of the range.
 */

    public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }

    static void selection_sort(int[] arr, int n){

    }
}
