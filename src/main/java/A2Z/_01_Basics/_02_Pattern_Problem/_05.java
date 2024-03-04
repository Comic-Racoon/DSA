package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _05 {
/*
    Input Format: N = 6
    Result:
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=>?");

        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
