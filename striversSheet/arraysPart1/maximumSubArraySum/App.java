package takeUForward.striversSheet.arraysPart1.maximumSubArraySum;

import takeUForward.striversSheet.arraysPart1.maximumSubArraySum.impl.BruteForceSolution;
import takeUForward.striversSheet.arraysPart1.maximumSubArraySum.impl.KadanesAlgorithm;

/**
 * created by JK
 * on 15/04/23
 **/

public class App {
    public static void main(String[] args) {
        int arr[] = new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("---------------------------------------");
        System.out.println("Brute Force Solution");
        System.out.println("---------------------------------------");
        Solution solution = new BruteForceSolution();
        int sum  = solution.findMaxSubArraySum(arr);
        System.out.println(sum);
        System.out.println("---------------------------------------");
        System.out.println("Kadane's Algo Solution");
        System.out.println("---------------------------------------");
        solution = new KadanesAlgorithm();
        sum  = solution.findMaxSubArraySum(arr);
        System.out.println(sum);
        System.out.println("---------------------------------------");
        System.out.println("Print max sum subArray using kadane's algo");
        System.out.println("---------------------------------------");
        arr = new int[]{-1, -4, -5};
        solution.printMaxSumSubArray(arr);
    }
}
