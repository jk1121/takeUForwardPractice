package takeUForward.striversSheet.arraysPart1.maximumSubArraySum.impl;


import takeUForward.striversSheet.arraysPart1.maximumSubArraySum.Solution;

/**
 * created by JK
 * on 15/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int findMaxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    @Override
    public void printMaxSumSubArray(int[] arr) {
        // implemented in kadane's algo
    }
}
