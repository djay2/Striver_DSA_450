//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(1)`     |
package Easy;

import java.util.Arrays;
import java.util.List;

public class ArrayIsSorted {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 23, 87, 92,101,120);
        System.out.println(IsArraySorted(integers));

    }
   static boolean IsArraySorted(List<Integer> arr)
    {
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)<arr.get(i-1))
                return false;
        }
        return true;
    }
}
