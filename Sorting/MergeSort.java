import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 5, 4, 3, 7, 8, 9, 10, 7);
        System.out.println(mergeSort(integers));

    }

    static List<Integer> mergeSort(List<Integer> integers)
    {
        // Base case: if the list has 0 or 1 elements
        if(integers.size()<=1) return integers;

        // Find the middle index to divide the list into two halves
        int mid=integers.size()/2;

        // Recursively sort the left half
        List<Integer> left=mergeSort(integers.subList(0,mid));

        // Recursively sort the right half
        List<Integer> right=mergeSort(integers.subList(mid,integers.size()));

        // Merge the two sorted halves and return the result
        return merge(left,right);
    }

    // Helper method to merge two sorted lists into one sorted list
    static List<Integer> merge(List<Integer> left, List<Integer> right) {

        //Result list to store merged output from left and right List
        List<Integer> C=new ArrayList<>();

        // Pointers for left and right lists
        int i=0,j=0;

        // Compare elements of both lists and add the smaller one to the result
        while(i<left.size() && j<right.size())
        {
            if(left.get(i)<right.get(j))
            {
                C.add(left.get(i));
                i++;
            }
            else
            {
                C.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements from left list (if any)
        while (i < left.size()) {
            C.add(left.get(i));
            i++;
        }
        // Add remaining elements from the right list (if any)
        while (j < right.size()) {
            C.add(right.get(j));
            j++;
        }
        // Return the fully merged and sorted list
        return C;
    }
}
