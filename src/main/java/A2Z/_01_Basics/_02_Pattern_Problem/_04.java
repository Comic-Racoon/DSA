package A2Z._01_Basics._02_Pattern_Problem;

import java.util.Scanner;

public class _04 {
/*
    Input Format: N = 6
    Result:
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    6 6 6 6 6 6
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=>?");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}