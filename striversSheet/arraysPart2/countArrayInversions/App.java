package takeUForward.striversSheet.arraysPart2.countArrayInversions;


import takeUForward.striversSheet.arraysPart2.countArrayInversions.impl.OptimalSolution;

/**
 * created by JK
 * on 26/04/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 6, 4, 1};
        Solution s = new OptimalSolution();
        int ans =s.getArrayInversionCount(arr);
        System.out.println(ans);



    }


}
