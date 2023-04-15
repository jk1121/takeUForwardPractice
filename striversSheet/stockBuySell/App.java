package takeUForward.striversSheet.stockBuySell;

import takeUForward.striversSheet.stockBuySell.impl.BruteForceSolution;
import takeUForward.striversSheet.stockBuySell.impl.OptimalSolution;

/**
 * created by JK
 * on 16/04/23
 **/

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("---------------------------------------");
        System.out.println("Brute Force Solution");
        System.out.println("---------------------------------------");
        Solution solution = new BruteForceSolution();
        System.out.println(solution.calculateMaxProfit(arr));
        System.out.println("---------------------------------------");
        System.out.println("Optimal Solution");
        System.out.println("---------------------------------------");
        solution = new OptimalSolution();
        System.out.println(solution.calculateMaxProfit(arr));

    }
}
