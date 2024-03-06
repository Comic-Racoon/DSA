package A2Z._01_Basics._04_Basic_Math;

public class _04_check_gcd {
/*
    Input: num1 = 4, num2 = 8
    Output: 4
    Explanation: Since 4 is the greatest number which divides both num1 and num2.
 */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // brute force approach
        System.out.println(gcd(num1,num2));
        // optimal approach
        System.out.println(gcd_optimal(num1,num2));
    }

    static int gcd(int n1 , int n2){
        int smaller_number=Math.min(n1,n2);
        int gcd = 1;

        for (int i=1; i<=smaller_number; i++){

            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    static int gcd_optimal(int a, int b) {
        if (b == 0) {
            return a;
        }
        //Gcd is the greatest number which is divided by both a and b.
        // If a number is divided by both a and b, it should be divided by (a-b) and b as well.
        return gcd(b, a % b);
    }

}
