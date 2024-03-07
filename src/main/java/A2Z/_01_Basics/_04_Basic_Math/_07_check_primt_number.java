package A2Z._01_Basics._04_Basic_Math;

public class _07_check_primt_number {

/*
        Input: N = 3
        Output: Prime
        Explanation: 3 is a prime number
 */
    public static void main(String[] args) {
        int n = 3;
        boolean ans = primeNumber(n);
        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }

    }

    static boolean primeNumber(int N){
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
