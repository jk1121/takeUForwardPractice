package takeUForward.striversSheet.arraysPart3.uniqueGridPaths;

import takeUForward.striversSheet.arraysPart3.uniqueGridPaths.impl.DpSolution;
import takeUForward.striversSheet.arraysPart3.uniqueGridPaths.impl.RecursiveSolution;

/**
 * created by JK
 * on 29/04/23
 **/

public class App {
    public static void main(String[] args) {
        Solution s = new RecursiveSolution();
        System.out.println(s.findUniqueGridPaths(0, 0, 3, 7));
        System.out.println(s.findUniqueGridPaths(0, 0, 2, 3));

        s = new DpSolution();
        System.out.println(s.findUniqueGridPaths(0, 0, 3, 7));
        System.out.println(s.findUniqueGridPaths(0, 0, 2, 3));

    }
}
