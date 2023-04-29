package takeUForward.striversSheet.arraysPart3.uniqueGridPaths.impl;

import takeUForward.striversSheet.arraysPart3.uniqueGridPaths.Solution;

/**
 * created by JK
 * on 29/04/23
 **/

public class RecursiveSolution implements Solution {
    @Override
    public int findUniqueGridPaths(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }
        return findUniqueGridPaths(i + 1, j, n, m) + findUniqueGridPaths(i, j + 1, n, m);
    }
}
