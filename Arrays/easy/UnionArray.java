import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Union of an Array:- There are 2 arrays must be in sorted order.
// The union of two arrays can be defined as the common and distinct elements in the two arrays
public class UnionArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,49,49,50);
        List<Integer> list2 = Arrays.asList(-12, -3, -1, 3, 87, 112, 1189,1189);

        System.out.println(unionArray(list1,list2));
    }
    static List<Integer> unionArray( List<Integer> list1,List<Integer> list2)
    {
        List<Integer> listUnion=new ArrayList<>();
        int i= 0;
        int j=0;


        // Traverse both lists using two pointers
        while(i<list1.size() && j<list2.size())
        {
            // Skip duplicate elements in list1 starting from index 1
            while(i>0 && i<list1.size() && list1.get(i)==list1.get(i-1))  i++;

            // Skip duplicate elements in list2 starting from index 1
            while(j>0 && j<list2.size() && list2.get(j)==list2.get(j-1))  j++;

            // Check if i or j reached beyond its respective list size or not
            if(i>list1.size() || j>list2.size()) break;

            // compare elements of list1 and list2 in asc order and add it in new list called listUnion
            if(list1.get(i)<list2.get(j))
            {
                listUnion.add(list1.get(i));
                i++;
            }
            else if(list1.get(i)==list2.get(j))
            {
                listUnion.add(list1.get(i));
                i++;
                j++;
            }
            else
            {
                listUnion.add(list2.get(j));
                j++;
            }

        }

        // Traverse leftover elements in list1 after above comparison and add them in a listUnion list
        while(i==0 || (i<list1.size() && list1.get(i)!=list1.get(i-1)))
        {
            listUnion.add(list1.get(i));
            i++;
        }

        // Traverse leftover elements in list2 after above comparison and add them in a listUnion list
        while(j==0 || (j<list2.size() && list2.get(j)!=list2.get(j-1)))
        {
            listUnion.add(list2.get(j));
            j++;
        }

        return listUnion;
    }
}
