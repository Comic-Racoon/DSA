package A2Z._01_Basics._05_Basic_recurssion;

public class _04_sum_of_1st_n_nos {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumOfnNumbers(n));
    }
    static int sumOfnNumbers(int n){
        if(n < 1){
            return 0;
        }

        return n + sumOfnNumbers(n-1);

    }
}
