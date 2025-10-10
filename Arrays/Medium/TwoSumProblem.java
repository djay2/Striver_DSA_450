package Medium;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSumProblem {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 4, 3, 2, 9,1, 11);

        System.out.println(TwoPointerApproach(list,10));
    }

    static List<List<Integer>> TwoPointerApproach(List <Integer> list,int sum)
    {
        List<List<Integer>> pairs=new ArrayList<>();
        int i=0, j=list.size()-1;
        Collections.sort(list);

        System.out.println(list);

        while(i<j)
        {
            System.out.println(list.get(i)+" "+list.get(j));
            if(list.get(i)+list.get(j)<sum) i++;
            else if(list.get(i)+list.get(j)>sum) j--;
            else
            {
                List<Integer> list2 = new ArrayList<>();
                list2.add(list.get(i));
                list2.add(list.get(j));
                pairs.add(list2);
                i++; j--;
            }
        }

        if(pairs.isEmpty())
        {
            pairs.add(Arrays.asList(-1,-1));

        }
        return pairs;
    }
}
