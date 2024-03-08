package A2Z._01_Basics._05_Basic_recurssion;

public class _01_print_n_times {
    public static void main(String[] args) {
        String name = "Rahul";
        int n = 5;

        print_n_timer(name, n);
    }

    static void print_n_timer(String name, int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        print_n_timer(name, n-1);
    }
}
