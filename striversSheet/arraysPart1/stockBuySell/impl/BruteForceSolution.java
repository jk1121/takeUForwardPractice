package takeUForward.striversSheet.arraysPart1.stockBuySell.impl;

import takeUForward.striversSheet.arraysPart1.stockBuySell.Solution;
import utils.Utility;

/**
 * created by JK
 * on 16/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int calculateMaxProfit(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxProfit = Utility.MaxOf(maxProfit, arr[j] - arr[i]);
                }
            }
        }
        return maxProfit;
    }
}
