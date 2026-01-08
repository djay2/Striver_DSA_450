package Medium;

import java.util.Arrays;
import java.util.List;

public class CountSubArrayWithGivenSum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 4);
        int k=4;

        int result=betterApproach(list,k);


        System.out.println(result);
    }

    static int betterApproach(List<Integer> list,int k)
    {
        int sum=0,count=0;
        for(int i=0;i<list.size();i++)
        {

            int j=i;
            sum=0;
            while(j<list.size())
            {
                sum+=list.get(j);
                if(sum==k){ count++; break;}

                j++;
            }
        }
        return count;
    }

//    static int optimalApproach(List<Integer> list,int k)
//    {
//
//    }
}
