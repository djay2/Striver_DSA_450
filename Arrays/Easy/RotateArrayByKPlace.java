package Easy;
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
        System.out.println(LeftRotateByKPlace(integers,3)); // left rotate
      //  System.out.println(RightRotateByKPlace(integers,3));
        System.out.println(RightRotateByKPlace(integers1,4)); // right rotate
        System.out.println(LeftRotateByKPlace(integers2,5)); //left rotate

    }
    // function for left rotation
   static List<Integer> LeftRotateByKPlace(List<Integer> arr,int place)
    { int size=arr.size();
        // Normalize 'place' to ensure it's within array bounds
        place%=size;

        // Step 1: Reverse the entire array
        reverse(arr,0,size-1);

        // Step 2: Reverse the first part (which will become the rotated front)
        reverse(arr,0,size-place-1);

        // Step 3: Reverse the second part (which will become the rotated back)
        reverse(arr,size-place,size-1);


        return arr;
    }

    // function for right rotation
    static List<Integer> RightRotateByKPlace(List<Integer> arr,int place)
    {
       int size2=arr.size();

        place%=size2; // Normalize 'place' to ensure it's within array bounds

        // use left rotation function by passing size2-place
        return LeftRotateByKPlace(arr,size2-place);
    }

    static List<Integer> reverse(List<Integer> arr, int start,int end)
    {
        while(start<end)
        { int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++; end--;
        }

        return arr;
    }
}
