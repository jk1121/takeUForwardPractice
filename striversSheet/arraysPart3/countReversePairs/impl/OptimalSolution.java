package takeUForward.striversSheet.arraysPart3.countReversePairs.impl;

import takeUForward.striversSheet.arraysPart3.countReversePairs.Solution;

/**
 * created by JK
 * on 28/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int countReversePairs(int[] arr) {
        int[] temp = new int[arr.length];
        return customMergeSort(arr, temp, 0, arr.length - 1);
    }

    private int customMergeSort(int[] arr, int[] temp, int low, int high) {
        int mid, count = 0;
        if (low < high) {
            mid = (low + high) / 2;
            count += customMergeSort(arr, temp, low, mid);
            count += customMergeSort(arr, temp, mid + 1, high);
            count += merge(arr, temp, low, mid + 1, high);
        }
        return count;
    }

    private int merge(int[] arr, int[] temp, int low, int mid, int high) {

        int count = 0;
        int a = low;
        int b = mid;
        int c = low;


        int j = mid;
        for (int i = low; i < mid; i++) {
            while (j <= high && arr[i] > 2 * arr[j]) {
                j++;
            }
            count += (j - mid);
        }


        // merge sort
        while (a < mid && b <= high) {
            if (arr[a] <= arr[b]) {
                temp[c++] = arr[a++];
            } else {
                temp[c++] = arr[b++];
            }
        }

        while (a < mid) {
            temp[c++] = arr[a++];
        }

        while (b <= high) {
            temp[c++] = arr[b++];
        }

        for (int x = low; x <= high; x++) {
            arr[x] = temp[x];

        }

        return count;
    }
}
