package A2Z._01_Basics._05_Basic_recurssion;

public class _02_print_1_to_n {
    public static void main(String[] args) {
        int n = 10;
        print_up_to_n(n , 1);
    }

    static void print_up_to_n(int n, int start){
        if(start==n){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        print_up_to_n(n, start+1);
    }
}
