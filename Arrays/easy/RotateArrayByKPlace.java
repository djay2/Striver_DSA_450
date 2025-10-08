//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(1)`     |


import java.util.Arrays;
import java.util.List;

public class RotateArrayByKPlace {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(87, 92,101,120,12,0);
        List<Integer> integers1 = Arrays.asList(87, 92,101,120,12,23);
        List<Integer> integers2 = Arrays.asList(12, 23, 87, 92,101,120);
        System.out.println(LeftRotateByKPlace(integers,3));
        System.out.println(LeftRotateByKPlace(integers1,4));
        System.out.println(LeftRotateByKPlace(integers2,5));

    }
   static List<Integer> LeftRotateByKPlace(List<Integer> arr,int place)
    {   int size=arr.size();
        int temp=arr.get(size-1);
        for(int i=size-1;i>0;i--)
        {
            arr.set(i,arr.get(i-1));
        }
        arr.set(0,temp);
        return arr;
    }
}
