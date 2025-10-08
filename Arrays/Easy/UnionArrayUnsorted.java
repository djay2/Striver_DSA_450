package Easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Union of an Array:- There are 2 arrays must be in an usorted order.
// The union of two arrays can be defined as the common and distinct elements in the two arrays
public class UnionArrayUnsorted {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,49,49,50);
        List<Integer> list2 = Arrays.asList(-12, -3, -1, 3, 87, 112, 1189,1189);

        // Using Stream API with TreeSet to preserve the order after combining 2 lists
        Set<Integer> union = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toCollection(TreeSet::new));

        
        System.out.println(union);

        System.out.println(unionArray(list1,list2));
    }

    //Using function with TreeSet
    static Set<Integer> unionArray(List<Integer> list1, List<Integer> list2)
    {
        Set<Integer> arrayUnion=new TreeSet<>();

        for(int num : list1)
            arrayUnion.add(num);

        for(int num : list2)
            arrayUnion.add(num);


        return arrayUnion;
    }
}
