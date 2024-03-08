package A2Z._01_Basics._04_Basic_Math;

public class _06_print_all_divisors {
/*
    Input: n = 36
    Output: 1 2 3 4 6 9 12 18 36
    Explanation: All the divisors of 36 are printed.
 */
    public static void main(String[] args) {
        int n = 36;
        printDivisorsBruteForce(36);
        printDivisorsOptimal(36);
    }

    static void printDivisorsBruteForce(int n){
        System.out.println("The Divisors of "+n+" are:");
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                System.out.print(i + " ");

        System.out.println();
    }

     static void printDivisorsOptimal(int n){

        System.out.println("The divisors of "+n+" are:");
        for(int i = 1; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " ");
            }

        System.out.println();
    }
}
