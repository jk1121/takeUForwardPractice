package takeUForward.striversSheet.arraysPart2.findDuplicatesInArray;

/**
 * created by JK
 * on 23/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
