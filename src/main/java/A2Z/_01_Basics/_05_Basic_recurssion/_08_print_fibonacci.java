package A2Z._01_Basics._05_Basic_recurssion;

public class _08_print_fibonacci {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);

        return last+slast;
    }
}
