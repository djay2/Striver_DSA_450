public class printNto1 {
    public static void main(String[] args) {

        funNto1(7);
    }

    static int funNto1(int num)
    {
        if(num<1) return 0;
        System.out.println(num);
        return funNto1(num-1);
    }
}