package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 1, 1));
        matrix.add(Arrays.asList(1, 0, 1));
        matrix.add(Arrays.asList(1, 1, 1));
        matrix.add(Arrays.asList(1, 1, 1));

        List<List<Integer>> updatedMatrix=new ArrayList<>();

        for(List<Integer> row : matrix)
        updatedMatrix.add(new ArrayList<>(row));

        setColRowZeroOptimalApproach(matrix.size(), matrix.get(0).size(),matrix);

      //  setColRowZeroBruteForceApproach(matrix);

        System.out.println(matrix);
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix.get(0).size();j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    System.out.println(matrix.get(i).get(j)==0);

           //         setColRowZeroBestApproach(i, j, updatedMatrix);
                    System.out.println("call ===========");
                }

            }
        }
    //    System.out.println(updatedMatrix);
    }

    static void setColRowZeroBruteForceApproach(List<List<Integer>> matrix)
    {
        for(int x=0;x<matrix.size();x++)
        {
            for(int y=0;y<matrix.get(0).size();y++)
            {
                if(matrix.get(x).get(y)==0)
                {
                    for(int z=0;z<matrix.size();z++)
                    {
                        if (matrix.get(z).get(y) != 0)
                            matrix.get(z).set(y, -1);
                    }

                    for (int w=0;w<matrix.get(0).size();w++)
                    {     if(matrix.get(x).get(w)!=0)
                            matrix.get(x).set(w,-1);
                    }
                }
            }
        }

        for(int x=0;x<matrix.size();x++)
        {
            for(int y=0;y<matrix.get(0).size();y++)
            {
                if(matrix.get(x).get(y)==-1) matrix.get(x).set(y,0);
            }
        }
    }

    static void setColRowZeroBestApproach(int row, int col, List<List<Integer>> matrix )
    {
        for(int i=0;i<matrix.get(0).size();i++)
        {
            matrix.get(row).set(i,0);
      //      System.out.println("row="+row+" col="+i);
        }
        for(int j=0;j<matrix.size();j++)
        {
            matrix.get(j).set(col,0);
        }
    }

    static void setColRowZeroOptimalApproach(int rows, int cols, List<List<Integer>> matrix )
    {
        System.out.println("Rows:"+ rows);
        System.out.println("Cols:"+ cols);
        boolean firstRowZero = false;
        for (int j = 0; j < cols; j++) {
            if (matrix.get(0).get(j) == 0) {
                firstRowZero = true;
                break;
            }
        }

        boolean firstColZero = false;
        for (int j = 0; j < rows; j++) {
            if (matrix.get(j).get(0) == 0) {
                firstColZero = true;
                break;
            }
        }

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    matrix.get(i).set(0,0);
                    matrix.get(0).set(j,0);
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix.get(i).set(0, 0);
            }
        }




    }


}
