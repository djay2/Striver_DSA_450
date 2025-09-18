//        | Metric           | Value |
//        | ---------------- | ----- |
//        | Time Complexity  | O(n)  |
//        | Space Complexity | O(n)  |


import java.util.Arrays;
import java.util.List;

public class SumOfElementsInArray {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sum(0,integers));
    }

    static int sum(int index,List<Integer> integers)
    {
        if(index>integers.size()-1) return 0;
        return integers.get(index)+ sum(index+1,integers);
    }
}