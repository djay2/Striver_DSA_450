import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
                    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

// To ensure variable a must be greater than variable b  
      if(a<b)
      {
          int temp=a;
          a=b;
          b=temp;
      }
      while(b!=0)
      {
          int temp=b;
          b=a%b; 
          a=temp;
      }

        System.out.println(a);
    }
}

// 24 36 --> 12
// 12 24 --> 12
// 2  3  --> 1