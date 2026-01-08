package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3, 10));
        matrix.add(Arrays.asList(4, 5, 6, 11));
        matrix.add(Arrays.asList(7, 8, 9, 12));
        matrix.add(Arrays.asList(10, 11, 12, 13));

        int left=0,right=matrix.get(0).size()-1;
        int top=0,down=matrix.size()-1;

        while (top <= down && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(matrix.get(top).get(i) + " ");
            top++;


            for (int i = top; i <= down; i++) {
                System.out.print(matrix.get(i).get(right) + " ");
            }
            right--;

            if (top <= down)
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix.get(down).get(j) + " ");
                }
            down--;


            if (left <= right) {
                // Move bottom → top
                for (int i = down; i >= top; i--) {
                    System.out.print(matrix.get(i).get(left) + " ");
                }
                left++;
            }
        }
    }
}
