package takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl;

import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Response;
import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.Solution;

import java.util.Arrays;


/**
 * created by JK
 * on 23/04/23
 **/

public class BruteForceSolution implements Solution {


    @Override
    public Response mergeSortedArrays(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0;
        for (; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i++] = arr2[j];
        }
        Arrays.sort(arr3);
        int[] res1 = new int[arr1.length];
        int[] res2 = new int[arr2.length];
        int f = 0;
        for (int x = 0; x < arr1.length; x++) {
            res1[x] = arr3[f++];
        }
        for (int z = 0; z < arr2.length; z++) {
            res2[z] = arr3[f++];
        }
        Response response = new Response();
        response.setArr1(res1);
        response.setArr2(res2);
        return response;
    }
}
