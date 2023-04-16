package takeUForward.striversSheet.arraysPart2.rotateMatrix.impl;

import takeUForward.striversSheet.arraysPart2.rotateMatrix.Solution;
import utils.Utility;

/**
 * created by JK
 * on 16/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int[][] rotateMatrix(int[][] matrix) {
        transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix[0].length / 2; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = t;
            }
        }
        return matrix;
    }

    private void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
