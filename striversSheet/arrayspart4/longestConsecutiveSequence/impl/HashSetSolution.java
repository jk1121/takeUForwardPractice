package takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.impl;

import jdk.jshell.execution.Util;
import takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.Solution;
import utils.Utility;

import java.util.HashSet;
import java.util.Set;

/**
 * created by JK
 * on 29/04/23
 **/

public class HashSetSolution implements Solution {
    @Override
    public int findSizeOfLongestConsecutiveSequence(int[] arr) {
        Set<Integer> store = new HashSet<>();
        int counter = 1;
        int maxCounter = 1;
        for (int a : arr) {
            store.add(a);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!store.contains(num - 1)) {
                int currentNum = num;
                counter = 1;
                while (store.contains(currentNum + 1)) {
                    currentNum += 1;
                    counter += 1;
                }
                maxCounter = Utility.MaxOf(counter, maxCounter);
            }
        }
        return maxCounter;
    }
}
