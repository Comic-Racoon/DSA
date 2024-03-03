package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _01 {
    // Pattern-1: Rectangular Star Pattern

/*
    Example 1:
    Input: N = 3
    Output:
    * * *
    * * *
    * * *
*/
    public static void main(String[] args) {
        System.out.println("n=?");
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        for( int i=0; i < n; i++){
            for( int j=0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
