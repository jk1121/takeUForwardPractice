package takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl;

import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Response;
import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Solution;
import utils.Utility;

/**
 * created by JK
 * on 23/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public Response mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int gap = (int) Math.ceil((arr1.length + arr2.length) >> 1);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (m + n)) {
                int condition = getCondition(arr1, arr2, i, j, m, n);
                switch (condition) {
                    case 0:
                        // j is in first array
                        Utility.CrossArraySwapInt(arr1, i, arr1, j);
                        break;
                    case 1:
                        // j is in second array , but i is in first array
                        Utility.CrossArraySwapInt(arr1, i, arr2, j - n);
                        break;
                    case 2:
                        // both i and j are in second array
                        Utility.CrossArraySwapInt(arr1, i - n, arr2, j - n);
                        break;
                }
                i++;
                j++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap = (int) Math.ceil(gap >> 1);
            }
        }
        Response response = new Response();
        response.setArr1(arr1);
        response.setArr2(arr2);
        return response;
    }

    private int getCondition(int[] arr1, int[] arr2, int i, int j, int m, int n) {
        if (j < n && arr1[i] > arr1[j]) {
            return 0;
        }

        if (j >= n && i < n && arr1[i] > arr2[j - n])
            return 1;

        if (j >= n && i >= n && arr1[i - n] > arr2[j - n])
            return 2;

        return -1;
    }
}
