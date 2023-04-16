package takeUForward.striversSheet.arraysPart1.sort012s.impl;

import takeUForward.striversSheet.arraysPart1.sort012s.Solution;
import utils.Utility;

/**
 * created by JK
 * on 16/04/23
 **/

public class DutchNationalFlagAlgorithm implements Solution {
    @Override
    public void sort012(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                Utility.swapInt(arr, mid, low);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                Utility.swapInt(arr, mid, high);
                high--;
            }

        }

    }
}
