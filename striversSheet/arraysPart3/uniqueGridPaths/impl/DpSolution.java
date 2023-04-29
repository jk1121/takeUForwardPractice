package takeUForward.striversSheet.arraysPart3.uniqueGridPaths.impl;

import takeUForward.striversSheet.arraysPart3.uniqueGridPaths.Solution;

import java.util.Arrays;

/**
 * created by JK
 * on 29/04/23
 **/

public class DpSolution implements Solution {
    @Override
    public int findUniqueGridPaths(int i, int j, int n, int m) {
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return countUniquePaths(dp, i, j, n, m);
    }

    private int countUniquePaths(int[][] dp, int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        return dp[i][j] = countUniquePaths(dp, i + 1, j, n, m) + countUniquePaths(dp, i, j + 1, n, m);
    }
}
