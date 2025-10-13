package Medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 2, 1, 3, 1,1, 1, 1);

        //Brute force approach
        System.out.println(bruteForceApproach(list));
        // Better apprach -using hashmap
        System.out.println(usingHashMap(list));
        //Boyer-Moore Voting Algorithm
        System.out.println(optimisedApproach(list));


    }

    // use two loops
    //time - complexity - O(n^2)
    //space - complexity - O(1)
    static int  bruteForceApproach(List<Integer> list)
    {
        for(int i:list)
        {
            int count=0;

            for(int j: list)
            {
                if(i==j) count++;
            }

            if(count> list.size()/2) return i;
        }
        return -1;
    }

    //use HashMap
    //time - complexity - O(n)
    //space - complexity - O(n)
    static int usingHashMap(List<Integer> list)
    {
        Map<Integer,Integer> count =new HashMap<>();

        for(int i: list)
        {
            if(count.containsKey(i))
                count.put(i,count.getOrDefault(i,0)+1);
            else
                count.put(i,1);
        }
        int getKey = count.entrySet().stream().filter(val -> val.getValue() > list.size() / 2)
                .map(Map.Entry::getKey).findFirst().orElse(-1);

        return getKey;
    }

    //Boyer-Moore Voting Algorithm
    // There are two loops-
    // first loop finds the candiate taht comes max times
    // second loop count the occurence of candidate
    // if candidate occurence is greater than n/2 return candidate else  return -1
    //time - complexity - O(n)
    //space - complexity - O(1)
    static int optimisedApproach(List<Integer> list)
    {
        int count=0;
        int candiate=0;

        for(int num:list)
        {
            if(count==0) candiate=num;

            count+=(candiate==num)?1:-1;
        }

        count=0;

        for(int num:list)
        {
            if(num==candiate) count++;
        }
        return count>list.size()/2?candiate:-1;
    }
}
