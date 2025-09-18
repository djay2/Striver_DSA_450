// Time Complexity: O(n)
public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int i=0,j=1;
     //   System.out.print(i+" "+j+" ");
        for(int z=0;z<n;z++)
        {
            System.out.print(i+" ");
            int k=i+j;
            i=j;
            j=k;

        }
    }
}
