package takeUForward.striversSheet.arraysPart1.maximumSubArraySum.impl;

import takeUForward.striversSheet.arraysPart1.maximumSubArraySum.Solution;

/**
 * created by JK
 * on 15/04/23
 **/

public class KadanesAlgorithm implements Solution {
    @Override
    public int findMaxSubArraySum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }

    @Override
    public void printMaxSumSubArray(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                end = i;
            }
            if (sum < 0) sum = 0;
        }

        for (int i = ansStart; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
