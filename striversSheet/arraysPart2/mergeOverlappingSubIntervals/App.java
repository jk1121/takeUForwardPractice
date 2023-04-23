package takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals;

import takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals.impl.BruteForceSolution;
import takeUForward.striversSheet.arraysPart2.mergeOverlappingSubIntervals.impl.OptimalSolution;

import java.util.ArrayList;
import java.util.List;

/**
 * created by JK
 * on 19/04/23
 **/

public class App {
    public static void main(String[] args) {
        List<Pair> input = new ArrayList<>();
        input.add(new Pair(1, 3));
        input.add(new Pair(2, 4));
        input.add(new Pair(2, 6));
        input.add(new Pair(8, 9));
        input.add(new Pair(8, 10));
        input.add(new Pair(9, 11));
        input.add(new Pair(15, 18));
        input.add(new Pair(16, 17));
//        input.add(new Pair(1, 4));
//        input.add(new Pair(4, 5));

        System.out.println("---------------------------------------");
        System.out.println("Brute Force Solution");
        System.out.println("---------------------------------------");
        Solution solution = new BruteForceSolution();
        List<Pair> ans = solution.mergeOverlappingSubArrays(input);
        ans.forEach(p -> System.out.println("[" + p.getStart() + "," + p.getEnd() + "]"));

        System.out.println("---------------------------------------");
        System.out.println("Optimal Solution");
        System.out.println("---------------------------------------");
        solution = new OptimalSolution();
        ans = solution.mergeOverlappingSubArrays(input);
        ans.forEach(p -> System.out.println("[" + p.getStart() + "," + p.getEnd() + "]"));

    }
}
