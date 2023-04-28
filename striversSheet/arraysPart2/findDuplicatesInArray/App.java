package takeUForward.striversSheet.arraysPart2.findDuplicatesInArray;

/**
 * created by JK
 * on 23/04/23
 **/

public class App {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 6, 9, 10, 5, 4, 3, 1, 8, 6, 7};
        Solution solution = new OptimalSolution();
        System.out.println(solution.findDuplicate(arr));

    }
}
