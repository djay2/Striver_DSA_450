import java.util.Arrays;
import java.util.List;

public class AllZerosToEnd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(87,0, 92,101,120,12,0);
        int index=0;

        // move all non-zero elements to the front
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=0)
            {
                list.set(index++, list.get(i));
            }
        }
        for(int j=index;j<list.size();j++)
            list.set(j,0);

        System.out.println(list);
    }
}
