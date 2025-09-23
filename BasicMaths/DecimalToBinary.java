public class DecimalToBinary {
    public static void main(String[] args) {
        long num=2;
        long res=0;
        long m=1;
        while (num>0)
        {
            long rem=num%2;
            res=res+rem*m;
            num/=2;
            m*=10;
        }
        System.out.println(res);
    }
}
