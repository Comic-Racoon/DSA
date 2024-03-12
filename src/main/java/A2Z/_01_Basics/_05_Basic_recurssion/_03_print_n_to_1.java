package A2Z._01_Basics._05_Basic_recurssion;

public class _03_print_n_to_1 {
    public static void main(String[] args) {
        int n = 10;
        print_n_to_1(n);
    }

    static void print_n_to_1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print_n_to_1(n-1);
    }
}
