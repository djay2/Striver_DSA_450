package Easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSumProblem {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 4, 3, 2, 6, 11);

        System.out.println(TwoPointerApproach(list,10));
    }

    static List<Integer> TwoPointerApproach(List <Integer> list,int sum)
    {
        List<Integer> pairs=new ArrayList<>();
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
                pairs.add(list.get(i));
                pairs.add(list.get(j));
                i++; j--;
            }
        }

        if(pairs.isEmpty())
        {
            pairs.add(-1);
            pairs.add(-1);
        }
        return pairs;
    }
}
