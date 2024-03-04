package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _06 {
/*
    Input Format: N = 6
    Result:
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=>?");

        int n = sc.nextInt();
        for(int i=n; i>=1 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
