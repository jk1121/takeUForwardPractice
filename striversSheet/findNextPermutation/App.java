package takeUForward.striversSheet.findNextPermutation;

import takeUForward.striversSheet.findNextPermutation.impl.BruteForceSolution;
import utils.Utility;

import java.util.List;
import java.util.stream.Collectors;

/**
 * created by JK
 * on 02/04/23
 **/

public class App {

    private static Solution solution;

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3};
        solution = new BruteForceSolution();
        List<String> permutations = solution.getAllPermutations(arr).stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(permutations);
        String inputPermutationString = Utility.ConvertIntArrayToString(arr);
        String nextPerm = solution.findNextPermutation(inputPermutationString, permutations);
        System.out.println(nextPerm);

    }
}
