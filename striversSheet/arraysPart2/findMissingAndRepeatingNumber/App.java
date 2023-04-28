package takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber;

import takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber.impl.BetterSolution;
import takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber.models.Response;

/**
 * created by JK
 * on 26/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6, 2, 1, 1};
        Solution s = new BetterSolution();
        Response response = s.getMissingAndRepeatingNumber(arr);
        System.out.println(response.getMissingNumber() + "," + response.getRepeatingNumber());

    }
}
