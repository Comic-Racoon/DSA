package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _02 {
/*
        Input Format: N = 6
        Result:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=>?");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<=i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
