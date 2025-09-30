import java.util.Arrays;
import java.util.List;

public class MaxCosnecutiveOnes {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,1,0,0,1,0,1,1,1,1,1,1);

        int max=0,count=0;
        for (Integer list: integers) {
          //  System.out.println(list==1);
            if(list==1) count++;
            else {
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        // Final check after loop ends
        if (max < count) {
            max = count;
        }
        System.out.println(max);
    }
}
