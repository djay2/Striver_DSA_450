package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort0s1s2s {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 0, 2, 2, 0, 1);

     //   bruteForceApproach(list); It sort the list in O(nlogn)
    //    bruteForceApproach2(list); It
        dutchNationalFlagAlgo(list);
        System.out.println(list);

    }
    static void bruteForceApproach1(List<Integer> list)
    {
        Collections.sort(list);
    }
    static void bruteForceApproach2(List<Integer> list)
    {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        // First pass: count 0s, 1s, and 2s → O(n)
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0) countZero++;
            else if(list.get(i)==1) countOne++;
            else countTwo++;
        }
        int index=0;
        // Second pass: overwrite list with 0s → O(n)
        while(countZero>0)
        {
            list.set(index++,0);
            countZero--;
        }
        // Overwrite with 1s → O(n)
        while(countOne>0)
        {
            list.set(index++,1);
            countOne--;
        }
        // Overwrite with 2s → O(n)
        while(countTwo>0)
        {
            list.set(index++,2);
            countTwo--;
        }
    }

    static void dutchNationalFlagAlgo(List<Integer> list)
    {
        int left=0,mid=0,right=list.size()-1;

        while(mid<=right)
        {
            switch (list.get(mid)){
                case 0: swap(list,left++,mid++);
                        break;
                case 1: mid++;
                        break;
                case 2: swap(list,mid,right--);
                        break;
            }
        }
    }
    static void swap(List<Integer> list,int left,int right)
    {
        int temp=list.get(left);
        list.set(left,list.get(right));
        list.set(right,temp);
    }
}
