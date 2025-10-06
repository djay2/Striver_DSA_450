import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubarrayWithGivenSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,1, 2, 6, 4, 12);

        System.out.println(PrefixSum(list,3)); // Time Complexity: O(n) , Space Complexity : O(1)
        System.out.println(TwoPointerApproach(list,3)); // Time Complexity: O(n2) , Space Complexity : O(n)

    }

    static int TwoPointerApproach(List<Integer> list,int k)
    {

        int maxLen = 0;
        int start = 0, sum = 0;

        for (int end = 0; end < list.size(); end++) {
            sum += list.get(end);

            // Shrink window from left if sum > k
            while (sum > k && start <= end) {
                sum -= list.get(start);
                start++;
            }

            // If sum == k, update max length
            if (sum == k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen;
    }

    static int PrefixSum(List<Integer> list,int sum)
    {
        List<Integer> PrefixSum = new ArrayList<>();
        PrefixSum.add(list.get(0));
        for (int i=1;i<list.size();i++)
            PrefixSum.add(PrefixSum.get(i-1)+list.get(i));

       int max_len=0;

        for(int i=0;i<PrefixSum.size();i++)
        {
            if (PrefixSum.get(i)==sum) max_len=i+1;
            else if(PrefixSum.get(i)>sum)
            {
                int j=i-1;
                while (j>=0)
                {
                    if(PrefixSum.get(i)-PrefixSum.get(j)==sum)
                    {
                        max_len=i-j;
                        break;
                    }
                    else if(PrefixSum.get(i)-PrefixSum.get(j)<sum)
                        j--;
                    else
                        break;
                }
            }
        }
        return max_len;
    }
}
