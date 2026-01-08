package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrixBy90 {
    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3,10));
        matrix.add(Arrays.asList(4, 5, 6,11));
        matrix.add(Arrays.asList(7, 8, 9,12));
       matrix.add(Arrays.asList(10, 11, 12,13));
        System.out.println(matrix);
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=i+1;j<matrix.get(0).size();j++)
            {
                int temp=matrix.get(i).get(j);
                matrix.get(i).set(j,matrix.get(j).get(i));
                matrix.get(j).set(i,temp);
            }
        }
        System.out.println(matrix);

        for(int i=0;i<matrix.get(0).size();i++)
        {
            int left = 0, right = matrix.get(0).size() - 1;
            while (left < right) {
                int temp = matrix.get(i).get(left);
                matrix.get(i).set(left, matrix.get(i).get(right));
                matrix.get(i).set(right, temp);
                left++;
                right--;
            }
        }

        System.out.println(matrix);
    }
}
