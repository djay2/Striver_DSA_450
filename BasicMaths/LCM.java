import java.lang.*;
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
               Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int a=num1;
        int b=num2;
    
// HCF code starts ===========   
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
// HCF coe ends ================

        System.out.println((num1*num2)/a);
    }
}