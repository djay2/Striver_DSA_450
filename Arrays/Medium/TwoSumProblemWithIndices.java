package Medium;

import java.util.*;

public class TwoSumProblemWithIndices {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(6, 4, 3, 2, 9,1, 11);

        int target=10;
        Map<Integer,Integer> pairs=new HashMap<>();

        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            List<Integer> temp = new ArrayList<>();
            int complement= target-list.get(i);
            if(pairs.containsKey(complement))
            {
                temp.add(pairs.get(complement));
                temp.add(i);
                result.add(temp);
            }
            else
            {
                pairs.put(list.get(i),i);
            }
        }

        System.out.println(result);

    }
}
