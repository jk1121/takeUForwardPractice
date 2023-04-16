package takeUForward.striversSheet.arraysPart1.pascalsTriangle.impl;

import takeUForward.striversSheet.arraysPart1.pascalsTriangle.Solution;

/**
 * created by JK
 * on 02/04/23
 **/

public class BruteForceSolution implements Solution {

    @Override
    public int[][] createPascalTriangle(int n) {
        int[][] matrix = new int[n][n];
        int rows = n;
        for (int row = 0; row < rows; row++) {
            int cols = row;
            matrix[row][0] = 1;
            matrix[row][cols] = 1;
            for (int col = 1; col <= cols - 1; col++) {
                matrix[row][col] = matrix[row - 1][col - 1] + matrix[row - 1][col];
            }
        }
        return matrix;


    }

    @Override
    public void printPascalTriangle(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] != 0) {
                    System.out.print(" " + matrix[row][col] + " ");
                }
            }
            System.out.println();

        }
    }
}
