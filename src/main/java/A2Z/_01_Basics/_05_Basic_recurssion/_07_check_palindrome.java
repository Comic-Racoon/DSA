package A2Z._01_Basics._05_Basic_recurssion;

public class _07_check_palindrome {
    public static void main(String[] args) {
        String str = "rahul";
        System.out.println(palindrome(str, 0));
    }

    static boolean palindrome(String s, int n ){
        if (n>s.length()/2){
            return true;
        }
        if(s.charAt(n)!=s.charAt(s.length()-n-1)){
            return false;
        }
        return palindrome(s, n+1);
    }
}
