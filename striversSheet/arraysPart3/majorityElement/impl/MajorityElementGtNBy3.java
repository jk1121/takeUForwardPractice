package takeUForward.striversSheet.arraysPart3.majorityElement.impl;

import takeUForward.striversSheet.arraysPart3.majorityElement.Solution;
import takeUForward.striversSheet.arraysPart3.majorityElement.models.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * created by JK
 * on 29/04/23
 **/

public class MajorityElementGtNBy3 implements Solution {

    @Override
    public Response findMajorityElement(int[] arr) {
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = -1;
        int el2 = -1;

        for (int a : arr) {
            if (el1 == a) {
                cnt1++;
            } else if (el2 == a) {
                cnt2++;
            } else if (cnt1 == 0) {
                cnt1 = 1;
                el1 = a;
            } else if (cnt2 == 0) {
                cnt2 = 1;
                el2 = a;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        int nBy3 = arr.length / 3;
        cnt1 = 0;
        cnt2 = 0;
        for (int a : arr) {
            if (a == el1) {
                cnt1++;
            } else if (a == el2) {
                cnt2++;
            }
        }

        List<Integer> nums = new ArrayList<Integer>();
        if (cnt1 > nBy3) {
            nums.add(el1);
        }
        if (cnt2 > nBy3) {
            nums.add(el2);
        }

        Response response = new Response();
        response.setNums(nums);
        return response;
    }
}
