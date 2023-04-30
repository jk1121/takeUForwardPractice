package takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.impl;

import takeUForward.striversSheet.arrayspart4.longestSubArrayWithKSum.Solution;
import utils.Utility;

import java.util.HashMap;
import java.util.Map;

/**
 * created by JK
 * on 30/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int getLongestSubArrayWithKSum(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> zeroMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (!zeroMap.containsKey(sum)) {
                    zeroMap.put(sum, i);
                } else {
                    max = Utility.MaxOf(max, i - zeroMap.get(sum));
                }
            }

        }

        return max;
    }
}
