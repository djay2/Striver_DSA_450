//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(1)`     |

import java.util.Arrays;
import java.util.List;

public class ArrayIsPalindrome {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(12, 23, 87, -1,-1,9, 87, 23, 12);

        int left=0;
        int right=integers.size()-1;
        boolean isPalindrome=false;
        while(left<right)
        {
            if(integers.get(left)==integers.get(right))
                isPalindrome=true;
            else
                isPalindrome=false;
            left++;
            right--;
        }
        if(isPalindrome)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is  not Palindrome");
    }
}