import java.util.Arrays;
import java.util.List;

public class ReverseAnArray
{
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        fun(integers.size()-1,integers);
    }

    static int fun(int n,List<Integer> integers)
    {
        if(n<0) return 0;
        System.out.println(integers.get(n));
        return fun(n-1, integers);
    }
}
