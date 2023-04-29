package takeUForward.striversSheet.arrayspart4.FourSum;

import takeUForward.striversSheet.arrayspart4.FourSum.impl.BruteForceSolution;
import takeUForward.striversSheet.arrayspart4.FourSum.impl.OptimalSolution;

import java.util.List;
import java.util.Set;

/**
 * created by JK
 * on 29/04/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        // brute force using binary search
        Solution solution = new BruteForceSolution();
        Set<List<Integer>> quadruplets = solution.findQuadruplets(arr, target);
        System.out.println(quadruplets);

        // optimal solution using 2 sum approach
        solution = new OptimalSolution();
        quadruplets = solution.findQuadruplets(arr, target);
        System.out.println(quadruplets);


    }
}
