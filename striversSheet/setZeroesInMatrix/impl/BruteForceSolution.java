package takeUForward.striversSheet.setZeroesInMatrix.impl;

import takeUForward.striversSheet.setZeroesInMatrix.Solution;

/**
 * created by JK
 * on 01/04/23
 **/

public class BruteForceSolution implements Solution {


    @Override
     public void setZeroesInMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Using Brute Force approach....");
        System.out.println("-------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {

                    // vertically up
                    int index = i - 1;
                    while (index >= 0) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index--;
                    }

                    // vertically down
                    index = i + 1;
                    while (index < rows) {
                        if (matrix[index][j] != 0) {
                            matrix[index][j] = -1;
                        }
                        index++;
                    }

                    // horizontally left
                    index = j - 1;
                    while (index >= 0) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index--;
                    }

                    // horizontally right
                    index = j + 1;
                    while (index < cols) {
                        if (matrix[i][index] != 0) {
                            matrix[i][index] = -1;
                        }
                        index++;
                    }

                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
