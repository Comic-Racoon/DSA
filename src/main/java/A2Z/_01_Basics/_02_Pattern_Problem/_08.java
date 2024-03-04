package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _08 {
/*
        Input Format: N = 3
        Result:
        *****
         ***
          *
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=>?");

        int n = sc.nextInt();

        //no of rows
        for(int i=0; i<n; i++){
            // For printing the spaces before stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }
            // For printing the spaces after the stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
