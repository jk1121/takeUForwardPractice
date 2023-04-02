package takeUForward.striversSheet.setZeroesInMatrix.impl;

import takeUForward.striversSheet.setZeroesInMatrix.Solution;

/**
 * created by JK
 * on 01/04/23
 **/

public class OptimalSolution implements Solution {

    @Override
    public void setZeroesInMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Using Better approach....");
        System.out.println("-------------------------------");
        int col0 = 1;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                col0 = 0;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }

            }
        }


        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }


    }
}
