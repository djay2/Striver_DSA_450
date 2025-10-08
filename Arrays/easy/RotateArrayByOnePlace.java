package Easy;
//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(1)`     |


import java.util.Arrays;
import java.util.List;

public class RotateArrayByOnePlace {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(87, 92,101,120,12,0);
        List<Integer> integers1 = Arrays.asList(87, 92,101,120,12,23);
        List<Integer> integers2 = Arrays.asList(12, 23, 87, 92,101,120);
        System.out.println(LeftRotateRotated(integers));
        System.out.println(RightRotateRotated(integers));
        System.out.println(LeftRotateRotated(integers1));
        System.out.println(LeftRotateRotated(integers2));

    }
   static List<Integer> LeftRotateRotated(List<Integer> arr)
    {   int size=arr.size();
        int temp=arr.get(size-1);
        for(int i=size-1;i>0;i--)
        {
            arr.set(i,arr.get(i-1));
        }
        arr.set(0,temp);
        return arr;
    }

    static List<Integer> RightRotateRotated(List<Integer> arr)
    {   int size=arr.size();
        int temp=arr.get(0);
        for(int i=0;i<size-1;i++)
        {
            arr.set(i,arr.get(i+1));
        }
        arr.set(size-1,temp);
        return arr;
    }
}
