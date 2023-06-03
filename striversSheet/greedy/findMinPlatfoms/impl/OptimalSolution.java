package takeUForward.striversSheet.greedy.findMinPlatfoms.impl;

import takeUForward.striversSheet.greedy.findMinPlatfoms.Solution;
import utils.Utility;

import java.util.Arrays;

/**
 * created by JK
 * on 01/05/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int findMinPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int n = arrival.length;
        int i = 1;
        int result = 1;
        int counter = 1;
        int j = 0;
        while (i < n && j < n) {

            if (arrival[i] <= departure[j]) {
                i++;
                counter++;
            } else {
                j++;
                counter--;
            }
            result = Utility.MaxOf(counter, result);
        }
        return result;
    }
}
