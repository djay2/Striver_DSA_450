import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	       
	       List<Integer> arr=Arrays.asList(1,2,3,4,1,5,3,4,2,3,2,6,1);
	       
	       Map<Integer,Integer> countElements=new HashMap<>();
	       
	       for(int num : arr) 
	       {
	           countElements.put(num,countElements.getOrDefault(num,0)+1);
	       }
	       
	       for(Map.Entry<Integer,Integer> getKeyValue : countElements.entrySet())
	       {
	           System.out.println(getKeyValue.getKey()+" "+ getKeyValue.getValue());
	       }
	       
	       

	}
}
