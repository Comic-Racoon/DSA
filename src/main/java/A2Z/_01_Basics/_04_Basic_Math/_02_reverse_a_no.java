package A2Z._01_Basics._04_Basic_Math;

public class _02_reverse_a_no {
/*
    Input: N = 234
    Output: 432
    Explanation: The reverse of 234 is 432
 */
    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse_no(n));
    }

    static int reverse_no(int n){
        int reverse_no = 0;

        while (n!=0){
            reverse_no = (reverse_no*10)+n%10;
            n=n/10;
        }

        return reverse_no;
    }
}
