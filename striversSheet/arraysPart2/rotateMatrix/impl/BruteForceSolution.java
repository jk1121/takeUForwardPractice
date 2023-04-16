package takeUForward.striversSheet.arraysPart2.rotateMatrix.impl;

import takeUForward.striversSheet.arraysPart2.rotateMatrix.Solution;

/**
 * created by JK
 * on 16/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int[][] rotateMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][matrix.length - i - 1] = matrix[i][j];
            }

        }
        return newMatrix;
    }
}
