package A2Z._01_Basics._06_Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class _01_Hashing_Therory {
/*
        Input: arr[] = {10,5,10,15,10,5};
        Output: 10  3
                5   2
                15  1
        Explanation: 10 occurs 3 times in the array
                     5 occurs 2 times in the array
                     15 occurs 1 time in the array
 */
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};


        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
