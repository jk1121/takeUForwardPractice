package takeUForward.striversSheet.arrayspart4.FourSum.impl;

import takeUForward.striversSheet.arrayspart4.FourSum.Solution;
import utils.Utility;

import java.util.*;

/**
 * created by JK
 * on 29/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public Set<List<Integer>> findQuadruplets(int[] arr, int target) {
        Set<List<Integer>> quadruplets = new HashSet<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = target - (arr[i] + arr[j] + arr[k]);
                    if (Utility.IsFoundInArr(arr, x, k + 1, n - 1)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(x);
                        Collections.sort(list);
                        quadruplets.add(list);
                    }

                }
            }
        }
        return quadruplets;
    }
}
