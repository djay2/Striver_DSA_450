import java.util.Arrays;
import java.util.List;

public class LargestElementInTheArray {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(23, -1, 4, 5, 6, 7, 12, 2, 3, 6, 7);

        int max=integers.get(0);

        for(int i=1;i<integers.size();i++)
        {
            if(max<integers.get(i))
                max=integers.get(i);
        }


        System.out.println(max);
    }
}