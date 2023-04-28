package takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber.impl;

import takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber.Solution;
import takeUForward.striversSheet.arraysPart2.findMissingAndRepeatingNumber.models.Response;

/**
 * created by JK
 * on 26/04/23
 **/

public class BetterSolution implements Solution {

    @Override
    public Response getMissingAndRepeatingNumber(int[] arr) {
        int len = arr.length;
        int arrSum = 0;
        int sumOfN = (len * (len + 1) / 2);
        int arrSqSum = 0;
        int sumOfSq = (len * (len + 1) * (2 * len + 1)) / 6;
        for (int i = 0; i < len; i++) {
            arrSum += arr[i];
            arrSqSum += (arr[i] * arr[i]);
        }
        int A = (sumOfN - arrSum);
        int B = (sumOfSq - arrSqSum);
        int x = ((B / A) + A) / 2;
        int y = x - A;
        Response response = new Response();
        response.setMissingNumber(x);
        response.setRepeatingNumber(y);
        return response;
    }
}
