package takeUForward.striversSheet.arraysPart1.findNextPermutation;

import java.util.List;

/**
 * created by JK
 * on 02/04/23
 **/

public interface Solution {

    List<String> getAllPermutations(int[] arr);

    String findNextPermutation(String inputPermutationString, List<String> permutations);

    String findNextPermutation(int[] arr);
}
