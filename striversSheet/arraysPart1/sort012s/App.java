package takeUForward.striversSheet.arraysPart1.sort012s;

import takeUForward.striversSheet.arraysPart1.sort012s.impl.DutchNationalFlagAlgorithm;

import java.util.Arrays;

/**
 * created by JK
 * on 16/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 0, 2, 1, 2, 1, 0, 1, 1, 0};
        Solution dutchNationalFlagAlgorithm = new DutchNationalFlagAlgorithm();
        dutchNationalFlagAlgorithm.sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
