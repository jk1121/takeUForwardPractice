package takeUForward.striversSheet.arraysPart1.stockBuySell.impl;

import takeUForward.striversSheet.arraysPart1.stockBuySell.Solution;
import utils.Utility;

/**
 * created by JK
 * on 16/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int calculateMaxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Utility.MinOf(min, arr[i]);
            maxProfit = Utility.MaxOf(maxProfit, arr[i] - min);
        }
        return maxProfit;
    }
}
