package takeUForward.striversSheet.arrayspart4.subArraysWithXorK.impl;

import takeUForward.striversSheet.arrayspart4.subArraysWithXorK.Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * created by JK
 * on 30/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int getNumberOfSubArraysWithXorK(int[] arr, int k) {
        Map<Integer, Integer> preXorMap = new HashMap<>();
        int counter = 0;
        int xr = 0;
        for (int i = 0; i < arr.length; i++) {
            xr ^= arr[i];
            if (xr == k) {
                counter++;
            }


            int y = xr ^ k;
            if (preXorMap.containsKey(y)) {
                counter += preXorMap.get(y);
            }


            if (!preXorMap.containsKey(xr)) {
                preXorMap.put(xr, 1);
            } else {
                preXorMap.put(xr, preXorMap.get(xr) + 1);
            }

        }

        return counter;
    }
}
