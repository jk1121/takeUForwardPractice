package takeUForward.striversSheet.arraysPart3.majorityElement;

import takeUForward.striversSheet.arraysPart3.majorityElement.impl.MajorityElementGtNBy2;
import takeUForward.striversSheet.arraysPart3.majorityElement.models.Response;

/**
 * created by JK
 * on 29/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 1, 1, 2,1, 1, 2, 1, 4, 1, 5, 2, 1, 3, 1, 2, 1, 1, 2};
        Solution s = new MajorityElementGtNBy2();
        Response r = s.findMajorityElement(arr);
        System.out.println(r.getNums());
    }
}
