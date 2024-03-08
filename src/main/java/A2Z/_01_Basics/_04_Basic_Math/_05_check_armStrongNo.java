package A2Z._01_Basics._04_Basic_Math;

public class _05_check_armStrongNo {
/*
        Input:153
        Output: Yes, it is an Armstrong Number
        Explanation: 1^3 + 5^3 + 3^3 = 153
 */
    public static void main(String[] args) {
        int n = 153;

        if (is_armstrong(n))
        {
            System.out.println("Yes, it is an Armstrong Number\n");
        }
        else
        {
            System.out.println("No, it is not an Armstrong Number\n");
        }

    }
    static boolean is_armstrong(int num){
        int originalno = num;
        int dummy =num;
        int count =0;

        while (dummy!=0){
            dummy=dummy/10;
            count++;
        }

        int sumofpower = 0;
        while (num != 0)
        {
            int digit = num % 10;
            sumofpower += (int) Math.pow(digit,count);
            num /= 10;
        }
        return (sumofpower == originalno);

    }
}
