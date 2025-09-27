import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Union of an Array:- There are 2 arrays must be in sorted order.
// The union of two arrays can be defined as the common and distinct elements in the two arrays
public class UnionArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,49,50);
        List<Integer> list2 = Arrays.asList(-12, -3, -1, 3, 87, 112, 1189);

        System.out.println();
    }
    static int unionArray( List<Integer> list1,List<Integer> list2)
    {
        List<Integer> listUnion=new ArrayList<>();
        int i= 0;
        int j=0;
        while(i<list1.size() && j<list2.size())
        {
            while(list1.get(i)==list2.get(j))
            {

            }
            if(list1.get(i)<list2.get(j))
            {
                listUnion.add(list1.get(i));
                i++;
            }
            else
            {
                listUnion.add(list2.get(j));
                j++;
            }
        }
        while ()

    }
}
