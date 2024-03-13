package A2Z._01_Basics._06_Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class _03_highest_lowest_frequency {
/*
        Input: array[] = {10,5,10,15,10,5};
        Output: 10 15
        Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
 */
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int length_arr = arr.length;
        frequency(arr, length_arr);
    }

    static void frequency(int[] arr, int length){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = length;
        int maxEle = 0, minEle = 0;

        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}
