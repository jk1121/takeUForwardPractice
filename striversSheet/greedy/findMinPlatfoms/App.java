package takeUForward.striversSheet.greedy.findMinPlatfoms;

import takeUForward.striversSheet.greedy.findMinPlatfoms.impl.BruteForceSolution;
import takeUForward.striversSheet.greedy.findMinPlatfoms.impl.OptimalSolution;

/**
 * created by JK
 * on 01/05/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arrival = new int[]{900, 945, 955, 1100, 1500, 1800};
        int[] departure = new int[]{920, 1200, 1130, 1150, 1900, 2000};
        Solution s = new BruteForceSolution();
        System.out.println(s.findMinPlatforms(arrival, departure));

        s = new OptimalSolution();
        System.out.println(s.findMinPlatforms(arrival, departure));
    }
}
