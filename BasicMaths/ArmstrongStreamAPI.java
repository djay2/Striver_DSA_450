// using java 9

import java.util.stream.IntStream;
class Main {
  public static void main(String[] args) {
    
    int num=153;
    int count=(int) Math.log10(Math.abs(num))+1;
    
    long armstrongNum=IntStream.iterate(num,i->i>0,i->i/10)
    .map(n->n%10)
    .map(d->(int)Math.pow(d,count))
    .sum();
    
    if(num==armstrongNum)
    System.out.println("yes");
        if(num!=armstrongNum)
    System.out.println("nope");
    
  }
}