package takeUForward.striversSheet.arraysPart3.majorityElement.impl;

import takeUForward.striversSheet.arraysPart3.majorityElement.Solution;
import takeUForward.striversSheet.arraysPart3.majorityElement.models.Response;

import java.util.Collections;

/**
 * created by JK
 * on 29/04/23
 **/

public class MajorityElementGtNBy2 implements Solution {

    @Override
    public Response findMajorityElement(int[] arr) {
        int count = 0;
        int element = -1;
        int nBy2 = arr.length / 2;

        for (int a : arr) {
            if (a == element) {
                count++;
            } else if (count == 0) {
                element = a;
                count = 1;
            } else {
                count--;
            }
        }

        count = 0;
        for (int a : arr) {
            if (a == element) {
                count++;
            }
        }
        if (count <= nBy2) {
            element = -1;
        }

        Response response = new Response();
        response.setNums(Collections.singletonList(element));
        return response;
    }
}
