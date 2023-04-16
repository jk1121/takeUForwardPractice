package takeUForward.striversSheet.arraysPart1.findNextPermutation.impl;

import takeUForward.striversSheet.arraysPart1.findNextPermutation.Solution;
import utils.Utility;

import java.util.Arrays;
import java.util.List;

/**
 * created by JK
 * on 03/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public List<String> getAllPermutations(int[] arr) {
        // implemented in brute force
        return null;
    }

    @Override
    public String findNextPermutation(String inputPermutationString, List<String> permutations) {
        // implemented in brute force
        return null;
    }

    @Override
    public String findNextPermutation(int[] arr) {
        int bpIndex = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                bpIndex = i;
                break;
            }
        }
        if (bpIndex == -1) {
            Utility.revereArray(arr);
            return Utility.ConvertIntArrayToString(arr);
        }
        for (int i = n - 1; i >= bpIndex; i--) {
            if (arr[i] > bpIndex) {
                Utility.swapInt(arr, i, bpIndex);
                break;
            }
        }
        Arrays.sort(arr, bpIndex + 1, n );
        return Utility.ConvertIntArrayToString(arr);
    }
}
