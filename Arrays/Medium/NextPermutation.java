package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 4, 3);
        int maxVal=Integer.MIN_VALUE;
        int size=list.size()-1;
        int lastIndex=size;
        System.out.println("lastIndex = "+lastIndex);


        int pivot=-1;
        for(int i=list.size()-1;i>0;i--)
        {
            if(list.get(i)>list.get(i-1))
            {  pivot=i-1;
               break;
            }
        }
        System.out.println("pivot ="+ pivot);
        swap(lastIndex,pivot,list);
        reverse(lastIndex,pivot+1,list);

        System.out.println("list = "+list);
    }

    static void swap(int i,int j, List<Integer> list)
    {
        int temp=list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
        System.out.println("afer swapping == "+ list);
    }

    static void reverse(int last,int first,List<Integer> list)
    {
        while(last>first)
        {
            swap(last,first,list);
            last--;
            first++;
        }
    }
}
