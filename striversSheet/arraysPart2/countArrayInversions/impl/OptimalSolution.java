package takeUForward.striversSheet.arraysPart2.countArrayInversions.impl;


import takeUForward.striversSheet.arraysPart2.countArrayInversions.Solution;

/**
 * created by JK
 * on 26/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int getArrayInversionCount(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    private int mergeSort(int[] arr, int[] temp, int low, int high) {
        int mid, intervals = 0;
        if (low < high) {
            mid = (low + high) / 2;
            intervals += mergeSort(arr, temp, low, mid);
            intervals += mergeSort(arr, temp, mid + 1, high);
            intervals += merge(arr, temp, low, mid + 1, high);
        }
        return intervals;
    }

    private int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int inv_count = 0;
        int i = left;
        int j = mid;
        int k = left;
        while ((i < mid ) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;
    }
}
