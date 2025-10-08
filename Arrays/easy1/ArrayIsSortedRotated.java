package Easy;
//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(1)`     |


import java.util.Arrays;
import java.util.List;

public class ArrayIsSortedRotated {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(87, 92,101,120,12,0);
        List<Integer> integers1 = Arrays.asList(87, 92,101,120,12,23);
        List<Integer> integers2 = Arrays.asList(12, 23, 87, 92,101,120);
        System.out.println(IsArraySortedRotated(integers));
        System.out.println(IsArraySortedRotated(integers1));
        System.out.println(IsArraySortedRotated(integers2));

    }
   static boolean IsArraySortedRotated(List<Integer> arr)
    { int count=0;
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)<arr.get(i-1))
                count++;
        }
        return count ==1;
    }
}
