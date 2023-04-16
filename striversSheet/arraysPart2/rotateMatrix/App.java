package takeUForward.striversSheet.arraysPart2.rotateMatrix;

import takeUForward.striversSheet.arraysPart2.rotateMatrix.impl.BruteForceSolution;
import takeUForward.striversSheet.arraysPart2.rotateMatrix.impl.OptimalSolution;

import java.util.Arrays;

/**
 * created by JK
 * on 16/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("---------------------------------------");
        System.out.println("Brute Force Solution");
        System.out.println("---------------------------------------");
        Solution solution = new BruteForceSolution();
        int[][] newMatrix = solution.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(newMatrix));
        System.out.println("---------------------------------------");
        System.out.println("Optimal Solution");
        System.out.println("---------------------------------------");
        solution = new OptimalSolution();
        newMatrix = solution.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(newMatrix));

    }
}
