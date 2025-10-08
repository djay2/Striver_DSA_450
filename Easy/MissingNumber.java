package Easy;
//        | Complexity Type | Value |
//        | --------------- | ----- |
//        | Time            | O(n)  |
//        | Space           | O(1)  |


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6);
        //find max element in O(n)
        int max= Collections.max(list);

        // apply XOR operation from 0 to max element present in the list
        int reduceN = IntStream.rangeClosed(0, max).reduce(0, (x, y) -> x ^ y);

        // apply XOR operation on list of elements present in list
        int reduceList = list.stream().reduce(0, (x, y) -> x ^ y);

        //apply further XOR operation from above 2 results to find out missing number in the list
        int missingNumber=reduceN^reduceList;
        System.out.println(missingNumber);
    }
}
