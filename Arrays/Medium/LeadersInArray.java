package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 4, 3);
        ArrayList<Integer> leaders = new ArrayList<>();
        int leader=Integer.MIN_VALUE;
        for(int i=list.size()-1;i>0;i--)
        {

            if(list.get(i)>leader)
            {
                leaders.add(list.get(i));
                leader=list.get(i);
            }

        }
        Collections.reverse(leaders);
    }
}
