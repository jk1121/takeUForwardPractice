package takeUForward.striversSheet.arrayspart4.TwoSum;

import takeUForward.striversSheet.arrayspart4.TwoSum.impl.BruteForceSolution;
import takeUForward.striversSheet.arrayspart4.TwoSum.impl.HashMapSolution;
import takeUForward.striversSheet.arrayspart4.TwoSum.impl.TwoPointerSolution;
import takeUForward.striversSheet.arrayspart4.TwoSum.pojos.TwoSum;

/**
 * created by JK
 * on 29/04/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 4};
        int target = 4;
        // brute force approach
        Solution s = new BruteForceSolution();
        TwoSum t = s.findTwoSumIndices(arr, target);
        System.out.println("Indices : [" + t.getIdx1() + "," + t.getIdx2() + "]");
//        System.out.println("Values : [" + arr[t.getIdx1()] + "," + arr[t.getIdx2()] + "]");

        // better solution - using hashmap
        s = new HashMapSolution();
        t = s.findTwoSumIndices(arr, target);
        System.out.println("Indices : [" + t.getIdx1() + "," + t.getIdx2() + "]");
//        System.out.println("Values : [" + arr[t.getIdx1()] + "," + arr[t.getIdx2()] + "]");

        // optimal solution - using two pointer approach
        s = new TwoPointerSolution();
        t = s.findTwoSumIndices(arr, target);
        System.out.println("Indices : [" + t.getIdx1() + "," + t.getIdx2() + "]");
//        System.out.println("Values : [" + arr[t.getIdx1()] + "," + arr[t.getIdx2()] + "]");
        // index changed due to array sorting


    }
}
