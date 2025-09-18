public class checkPalindrome {
    public static void main(String[] args) {
        int num=12321;
        int rev=0;
        System.out.println(palindrome(num,rev));

    }
    static boolean palindrome(int num, int reverse)
    {
        if(num<reverse)
            return (num== reverse) || (num== reverse/10) ;

        return palindrome(num/10,reverse*10+num%10);
    }

}