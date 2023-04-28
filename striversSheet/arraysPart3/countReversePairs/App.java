package takeUForward.striversSheet.arraysPart3.countReversePairs;

import takeUForward.striversSheet.arraysPart3.countReversePairs.impl.OptimalSolution;

/**
 * created by JK
 * on 28/04/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{40, 25, 19, 12, 9, 6, 2};
        Solution s = new OptimalSolution();
        int x = s.countReversePairs(arr);
        System.out.println(x);
    }
}
