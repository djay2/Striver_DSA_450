package Easy;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 12, 3, 87, 11, 1);
        int element=23; // element to search in a list
        System.out.println(linearSearchAlgorithm(element,list)); //returns -1 since 23 is not present in the list

        System.out.println(linearSearchAlgorithm(3,list));//returns 1 since 3 is not present in the list
    }
    static int linearSearchAlgorithm(int element,List<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if(element== list.get(i))
                return 1;
        }
        return -1;
    }
}
