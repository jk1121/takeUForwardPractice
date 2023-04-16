package takeUForward.striversSheet.arraysPart1.findNextPermutation.impl;

import takeUForward.striversSheet.arraysPart1.findNextPermutation.Solution;
import utils.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * created by JK
 * on 02/04/23
 **/

public class BruteForceSolution implements Solution {

    private List<String> ans = new ArrayList<>();

    @Override
    public List<String> getAllPermutations(int[] arr) {
        permute(0, arr, ans);
        return ans;
    }

    @Override
    public String findNextPermutation(String inputPermutationString, List<String> permutations) {
        int index = permutations.indexOf(inputPermutationString);
        if (index == permutations.size() - 1) {
            index = 0;
        } else {
            index = index + 1;
        }
        return permutations.get(index);

    }

    @Override
    public String findNextPermutation(int[] arr) {
        // implemented in optimal soln
        return null;
    }

    private void permute(int index, int[] arr, List<String> ans) {
        if (index == arr.length) {
            StringBuilder s = new StringBuilder();
            for (int j : arr) {
                s.append(j);
            }
            ans.add(s.toString());
            return;
        }
        for (int i = index; i < arr.length; i++) {
            Utility.swapInt(arr, i, index);
            permute(index + 1, arr, ans);
            Utility.swapInt(arr, i, index);
        }
    }
}
