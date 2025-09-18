public class print1toN {
    public static void main(String[] args) {

        fun1toN(7);
    }

    static int fun1toN(int num)
    {
        if(num<1) return 0;

        fun1toN(num-1);
        System.out.println(num);
        return 0;
    }
}