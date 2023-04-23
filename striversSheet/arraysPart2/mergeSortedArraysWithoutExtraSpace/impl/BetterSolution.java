package takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl;

import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Response;
import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Solution;
import utils.Utility;

/**
 * created by JK
 * on 23/04/23
 **/

public class BetterSolution implements Solution {
    @Override
    public Response mergeSortedArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                Utility.CrossArraySwapInt(arr1, i, arr2, 0);
                rearrangeArr(arr2);
            }
        }
        Response response = new Response();
        response.setArr1(arr1);
        response.setArr2(arr2);
        return response;
    }

    private void rearrangeArr(int[] arr2) {
        int first = arr2[0];
        int len = arr2.length;

        // use insertion sort , to put the swapped
        // 0th element at correct position
        int k = 1;
        for (; k < len && arr2[k] < first; k++) {
            arr2[k - 1] = arr2[k];
        }
        arr2[k - 1] = first;

    }
}
