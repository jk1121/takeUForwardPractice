package takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace;

import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl.BetterSolution;
import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl.BruteForceSolution;
import takeUForward.striversSheet.arraysPart2.mergeSortedArraysWithoutExtraSpace.impl.OptimalSolution;

import java.util.Arrays;
import java.util.List;

/**
 * created by JK
 * on 16/04/23
 **/

public class App {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 9};

        System.out.println("---------------------------------------");
        System.out.println("Brute Force Solution");
        System.out.println("---------------------------------------");
        Solution solution = new BruteForceSolution();
        Response response = solution.mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(response.getArr1()));
        System.out.println(Arrays.toString(response.getArr2()));

        System.out.println("---------------------------------------");
        System.out.println("Better Solution - Insertion sort and swap method");
        System.out.println("---------------------------------------");
        solution = new BetterSolution();
        response = solution.mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(response.getArr1()));
        System.out.println(Arrays.toString(response.getArr2()));

        System.out.println("---------------------------------------");
        System.out.println("Optimal Solution - Gap method");
        System.out.println("---------------------------------------");
        solution = new OptimalSolution();
        response = solution.mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(response.getArr1()));
        System.out.println(Arrays.toString(response.getArr2()));

    }
}
