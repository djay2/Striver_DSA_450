package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LCS {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(200, 9, 100, 5, 7, 6, 8,1);

        System.out.println(list);


        System.out.println(betterApproach(list));
    }

//
    static int betterApproach(List<Integer> list)
    {
        Collections.sort(list);

        int maxCount=0, count=1;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i+1).equals(list.get(i)+1))
            {
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else
                count=1;
        }
        return maxCount;
    }
}
