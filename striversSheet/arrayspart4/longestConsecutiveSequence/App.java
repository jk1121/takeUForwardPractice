package takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence;

import takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.impl.BruteForceSolution;
import takeUForward.striversSheet.arrayspart4.longestConsecutiveSequence.impl.HashSetSolution;

/**
 * created by JK
 * on 29/04/23
 **/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 200, 3, 1, 4, 2};
        Solution s = new BruteForceSolution();
        System.out.println(s.findSizeOfLongestConsecutiveSequence(arr));

        // optimal approach
        s = new HashSetSolution();
        System.out.println(s.findSizeOfLongestConsecutiveSequence(arr));
    }
}
