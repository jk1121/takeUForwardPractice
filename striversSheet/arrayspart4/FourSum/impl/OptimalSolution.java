package takeUForward.striversSheet.arrayspart4.FourSum.impl;

import takeUForward.striversSheet.arrayspart4.FourSum.Solution;

import java.util.*;

/**
 * created by JK
 * on 29/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public Set<List<Integer>> findQuadruplets(int[] arr, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int target3 = target - arr[i];
            for (int j = i + 1; j < n; j++) {
                int target2 = target3 - arr[j];
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int twoSum = arr[left] + arr[right];
                    if (twoSum < target2) {
                        left++;
                    } else if (twoSum > target2) {
                        right--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        set.add(list);

                        // not sorting , will manually avoid duplicate entries

                        // Processing the duplicates of number 3
                        while (left < right && arr[left] == list.get(2)) {
                            left++;
                        }

                        // Processing the duplicates of number 4
                        while (left < right && arr[right] == list.get(3)) {
                            right--;
                        }

                    }
                }

                // Processing the duplicates of number 2
                while (j + 1 < n && arr[j + 1] == arr[j]) {
                    j++;
                }
                while (i + 1 < n && arr[i + 1] == arr[i]) {
                    i++;
                }

            }
        }
        return set;
    }
}
