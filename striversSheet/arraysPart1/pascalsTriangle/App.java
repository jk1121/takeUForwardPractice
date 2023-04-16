package takeUForward.striversSheet.arraysPart1.pascalsTriangle;

import takeUForward.striversSheet.arraysPart1.pascalsTriangle.impl.BruteForceSolution;

/**
 * created by JK
 * on 02/04/23
 **/

public class App {

    private static Solution solution;

    public static void main(String[] args) {
        solution = new BruteForceSolution();
        int[][] matrix = solution.createPascalTriangle(5);
        solution.printPascalTriangle(matrix);
    }
}
