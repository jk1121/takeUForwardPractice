package takeUForward.striversSheet.arrayspart4.TwoSum.impl;

import takeUForward.striversSheet.arrayspart4.TwoSum.Solution;
import takeUForward.striversSheet.arrayspart4.TwoSum.pojos.TwoSum;

/**
 * created by JK
 * on 29/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public TwoSum findTwoSumIndices(int[] arr, int target) {
        TwoSum response = new TwoSum(-1, -1);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    response.setIdx1(i);
                    response.setIdx2(j);
                    break;
                }
            }
        }
        return response;
    }
}
