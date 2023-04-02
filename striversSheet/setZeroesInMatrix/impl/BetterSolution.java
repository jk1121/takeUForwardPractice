package takeUForward.striversSheet.setZeroesInMatrix.impl;

import takeUForward.striversSheet.setZeroesInMatrix.Solution;

import java.util.Arrays;

/**
 * created by JK
 * on 01/04/23
 **/

public class BetterSolution implements Solution {

    @Override
    public void setZeroesInMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Using Better approach....");
        System.out.println("-------------------------------");
        int[] temp1 = new int[rows];
        int[] temp2 = new int[cols];
        setDefaultArrayValues(temp1);
        setDefaultArrayValues(temp2);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    temp1[i] = 0;
                    temp2[j] = 0;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (temp1[i] == 0 || temp2[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void setDefaultArrayValues(int[] arr) {
        Arrays.fill(arr, -1);
    }
}
