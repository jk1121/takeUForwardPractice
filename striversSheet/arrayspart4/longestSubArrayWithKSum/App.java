package takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum;

import takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.impl.BruteForceSolution;
import takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.impl.OptimalSolution;

/**
 * created by JK
 * on 30/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr =  new int[] {9, -3, 3, -1, 6, -5};
//        int[] arr = new int[]{1, 0, -5};
//        int[] arr = new int[]{1, 3, -5, 6, -2};
        Solution s = new BruteForceSolution();
        System.out.println(s.getLongestSubArrayWithKSum(arr, 0));

        s = new OptimalSolution();
        System.out.println(s.getLongestSubArrayWithKSum(arr, 0));

    }
}
