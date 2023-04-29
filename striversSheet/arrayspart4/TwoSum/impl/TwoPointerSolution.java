package takeUForward.striversSheet.arrayspart4.TwoSum.impl;

import takeUForward.striversSheet.arrayspart4.TwoSum.Solution;
import takeUForward.striversSheet.arrayspart4.TwoSum.pojos.TwoSum;

import java.util.Arrays;

/**
 * created by JK
 * on 29/04/23
 **/

public class TwoPointerSolution implements Solution {
    @Override
    public TwoSum findTwoSumIndices(int[] arr, int target) {

        TwoSum response = new TwoSum(-1, -1);
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            if (arr[left] + arr[right] < target) {
                left++;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                // == target
                response.setIdx1(left);
                response.setIdx2(right);
                break;
            }
        }

        return response;
    }
}
