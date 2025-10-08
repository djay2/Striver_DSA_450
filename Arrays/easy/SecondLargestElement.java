import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(23, -1, 4, 5, 6, 7, 12, 2, 3, 6, 7);
        int largest =Integer.MIN_VALUE;
        int sec_largest= Integer.MIN_VALUE;

        for(int i=0;i<integers.size();i++)
        {
            if(largest<integers.get(i))
            {
                sec_largest=largest;
                largest=integers.get(i);
            }
            else if(sec_largest <integers.get(i))
                sec_largest=integers.get(i);
        }
        System.out.println(largest+" "+sec_largest);
    }
}
