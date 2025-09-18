import java.util.stream.IntStream;

class Main {

    public static void main(String[] args) {
         // Output: 5
        int result =IntStream.rangeClosed(1,4)
        .reduce(1,(a,b)-> a*b);
        System.out.println(result); 
    }
}