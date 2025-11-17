package Medium;

import java.util.Arrays;
import java.util.List;

public class StockBuySell {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, 1, 2, 3, 4, 5, 8, 3, 1, 0);
        int maxProfit=0;
        int minNum=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            minNum=Math.min(minNum,nums.get(i));
            maxProfit=Math.max(maxProfit,nums.get(i)-minNum);
        }
        System.out.println(maxProfit);
    }
}
