import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 2, 4, 5, 6, 10, 1);

        for(int i=1;i<integers.size();i++)
        {
            int minKey=integers.get(i);
            int j=i-1;
            while(j>=0 && integers.get(j)>minKey)
            {
                integers.set(j+1, integers.get(j));
                j--;
            }
            integers.set(j+1,minKey);
        }
        System.out.println(integers);
    }
}
