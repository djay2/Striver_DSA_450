package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(-1, -3, 4, 9, -4,8);
        List<Integer>  arrangedList= new ArrayList<>(arrList);
        int evenIndex=0,oddIndex=1;
        for(int i=0;i<arrList.size();i++)
        {
            if(arrList.get(i)<0)
            {
                arrangedList.set(oddIndex,arrList.get(i));
                oddIndex+=2;
            }
            else
            {
                arrangedList.set(evenIndex,arrList.get(i));
                evenIndex+=2;
            }
        }
        System.out.println(arrangedList);
    }
}
