import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 2, 4, 5, 6, 10, 1);

        for(int i=0;i<integers.size()-1;i++)
        {
            for(int j=0;j<integers.size()-1-i;j++)
            {
                if(integers.get(j)>integers.get(j+1))
                {
                    int temp=integers.get(j);
                    integers.set(j,integers.get(j+1));
                    integers.set(j+1,temp);
                }
            }
        }
        System.out.println(integers);
    }
}
