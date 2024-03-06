package A2Z._01_Basics._04_Basic_Math;

import java.util.Scanner;

public class _01_Count_digit {

/*
    Input: N = 12345
    Output: 5
    Explanation: N has 5 digits
 */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("add string of digit");

        int n = ip.nextInt();

        int count=0;

        while (n != 0){
            n = n/10;
            count+=1;

        }
        System.out.println(count);
    }
}
