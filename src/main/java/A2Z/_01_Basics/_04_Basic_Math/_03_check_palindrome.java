package A2Z._01_Basics._04_Basic_Math;

public class _03_check_palindrome {
/*
    Example 2:
    Input: N =  121
    Output: Palindrome Number
    Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
 */
    public static void main(String[] args) {
        int x = 1211;
        int dummy = x;
        int y = reverse_no(x);
        if (dummy == y) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }


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
