//        | Metric           | Complexity |
//        | ---------------- | ---------- |
//        | Time Complexity  | `O(n)`     |
//        | Space Complexity | `O(n)`     |


// Time Complexity: O(n)
//        Why?
//         iterate through the list once (for loop):
//        ➤ O(n) where n = list.size()
//
//        All operations inside the loop are constant time:
//
//        Map.containsKey(...) → O(1) average case
//
//        Map.put(...) → O(1) average case
//
//        Map.get(...), List.add(...) → O(1)
//
//        So the total time is O(n) — linear in the size of the input list.


//  Space Complexity: O(n)
//        Why?
//         use a Map<Integer, Integer> (pairs) to store seen elements and their indices.
//        ➤ In the worst case, you may store all n elements → O(n)
//
//         use a List<List<Integer>> result to store output pairs.
//        ➤ In worst case, up to O(n) pairs (e.g., if every pair sums to target), but typically much fewer.
//
//         So the total space is O(n) — due to auxiliary data structures (Map and List).

package Medium;

import java.util.*;

public class TwoSumProblemWithIndices {

    public static void main(String[] args) {

        // Input list and target sum
        List<Integer> list = Arrays.asList(6, 4, 3, 2, 9, 1, 11);
        int target = 10;

        // Map to store each number and its index as we traverse the list
        Map<Integer, Integer> pairs = new HashMap<>();

        // To store the resulting index pairs whose values sum to the target
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the list
        for (int i = 0; i < list.size(); i++) {

            // Find the complement that would sum with current element to reach the target
            int complement = target - list.get(i);

            // If the complement is already seen (i.e., present in the map)
            if (pairs.containsKey(complement)) {
                // Create a new pair: [index of complement, current index]
                List<Integer> temp = new ArrayList<>();
                temp.add(pairs.get(complement)); // index of the complement
                temp.add(i);                     // current index
                result.add(temp);                // add pair to result
            } else {
                // If complement not found, store the current element with its index
                pairs.put(list.get(i), i);
            }
        }

        // Print list of index pairs that sum up to the target
        System.out.println(result);

    }
}
