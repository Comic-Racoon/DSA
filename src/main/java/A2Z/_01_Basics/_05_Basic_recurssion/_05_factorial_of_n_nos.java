package A2Z._01_Basics._05_Basic_recurssion;

public class _05_factorial_of_n_nos {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
