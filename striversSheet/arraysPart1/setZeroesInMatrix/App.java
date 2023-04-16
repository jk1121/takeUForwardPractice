package takeUForward.striversSheet.arraysPart1.setZeroesInMatrix;

import takeUForward.striversSheet.arraysPart1.setZeroesInMatrix.impl.OptimalSolution;
import utils.Utility;

/**
 * created by JK
 * on 01/04/23
 **/

public class App {

    private static Solution solution;

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Input Matrix");
        System.out.println("-------------");
        Utility.PrintMatrix(matrix, rows, cols);
//        solution = new BruteForceSolution();
//        solution = new BetterSolution();
        solution = new OptimalSolution();
        solution.setZeroesInMatrix(matrix, rows, cols);
        System.out.println("\nConverted Matrix");
        System.out.println("-------------------");
        Utility.PrintMatrix(matrix, rows, cols);
    }
}
