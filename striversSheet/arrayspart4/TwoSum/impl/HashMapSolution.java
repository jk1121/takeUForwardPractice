package takeUForward.striversSheet.arrayspart4.TwoSum.impl;

import takeUForward.striversSheet.arrayspart4.TwoSum.Solution;
import takeUForward.striversSheet.arrayspart4.TwoSum.pojos.TwoSum;

import java.util.HashMap;

/**
 * created by JK
 * on 29/04/23
 **/

public class HashMapSolution implements Solution {
    @Override
    public TwoSum findTwoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();
        TwoSum response = new TwoSum(-1, -1);
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            if (store.containsKey(val)) {
                response.setIdx2(i);
                response.setIdx2(store.get(val));
                break;
            }
            store.put(arr[i], i);
        }

        return response;
    }
}
