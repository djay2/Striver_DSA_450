import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 2, 4, 5, 6, 10, 1);

        for(int i=0;i<integers.size()-1;i++)
        { int min_index=i;
            for(int j=i;j<integers.size();j++)
            {
                if(integers.get(j)<integers.get(min_index))
                min_index=j;
            }
            if(min_index!=i)
            {
                int temp=integers.get(i);
                integers.set(i,integers.get(min_index));
                integers.set(min_index,temp);
            }
        }

        System.out.println(integers);
    }
}
