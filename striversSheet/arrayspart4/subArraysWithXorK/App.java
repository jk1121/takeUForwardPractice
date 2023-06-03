package takeUForward.striversSheet.arrayspart4.subArraysWithXorK;

import takeUForward.striversSheet.arrayspart4.subArraysWithXorK.impl.OptimalSolution;

/**
 * created by JK
 * on 30/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9};
        Solution s = new OptimalSolution();
        System.out.println(s.getNumberOfSubArraysWithXorK(arr,5));


    }
}
