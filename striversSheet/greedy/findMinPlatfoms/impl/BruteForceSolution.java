package takeUForward.striversSheet.greedy.findMinPlatfoms.impl;

import takeUForward.striversSheet.greedy.findMinPlatfoms.Solution;
import utils.Utility;

/**
 * created by JK
 * on 01/05/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int findMinPlatforms(int[] arrival, int[] departure) {
        int result = 1;
        for (int i = 0; i < arrival.length; i++) {
            int count = 1;
            for (int j = i + 1; j < departure.length; j++) {
                if ((arrival[i] >= arrival[j] && arrival[i] <= departure[j])
                        || ((arrival[j] >= arrival[i] && arrival[j] <= departure[i]))
                ) {
                    count++;
                }
            }
            result = Utility.MaxOf(result, count);
        }
        return result;
    }
}
