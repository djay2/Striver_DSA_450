public class BinaryToDecimal {
    public static void main(String[] args) {
        long num=1010;
        long res=0;
        long m=1;
        while (num>0)
        {
            long rem=num%10;
            res=res+rem*m;
            num/=10;
            m*=2;
        }
        System.out.println(res);
    }
}
