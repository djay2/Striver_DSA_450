package Medium;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MaxSubArraySum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);

        System.out.println(bruteForce(list));
        System.out.println(betterApproach(list));
        System.out.println(kadenceAlgo(list));

    }
    // Brute Force Approach
    // Time Complexity -- O(n^3)
    // Space Complexity -- O(1)
    static int bruteForce(List<Integer> list)
    {    int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i;j<list.size();j++)
            {
                int sum=0;

                for(int k=i;k<=j;k++)
                {
                    sum+=list.get(k);
                }
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    // Brute Force Approach
    // Time Complexity -- O(n^2)
    // Space Complexity -- O(1)
    static int betterApproach(List<Integer> list)
    {    int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            int sum=0;
            for(int j=i;j<list.size();j++)
            {
                sum+= list.get(j);
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    // kadence Algo
    // Time Complexity -- O(n)
    // Space Complexity -- O(1)
    static int kadenceAlgo(List<Integer> list)
    {
        int maxSum=list.get(0),currSum=list.get(0);

        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);
            // Either start new subarray at num or extend current one
            currSum=Math.max(num,currSum+num);
            // Track best sum seen so far
            maxSum=Math.max(currSum,maxSum);

        }
        return maxSum;
    }
}
