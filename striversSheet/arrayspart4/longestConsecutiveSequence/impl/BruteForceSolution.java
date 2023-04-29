package takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.impl;

import takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.Solution;
import utils.Utility;

import java.util.Arrays;

/**
 * created by JK
 * on 29/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int findSizeOfLongestConsecutiveSequence(int[] arr) {
        Arrays.sort(arr);
        int counter = 1, maxCounter = 1;
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev + 1) {
                counter++;
            } else {
                counter = 1;
            }
            prev = arr[i];
            maxCounter = Utility.MaxOf(counter, maxCounter);
        }
        return maxCounter;
    }
}
