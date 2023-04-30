package takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.impl;

import takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.Solution;
import utils.Utility;

/**
 * created by JK
 * on 30/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int getLongestSubArrayWithKSum(int[] arr, int k) {


        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    max = Utility.MaxOf(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
