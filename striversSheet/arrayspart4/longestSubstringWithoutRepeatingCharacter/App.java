package takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter;

import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl.BetterSolution;
import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl.BruteForceSolution;
import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl.OptimalSolution;

/**
 * created by JK
 * on 30/04/23
 **/

public class App {
    public static void main(String[] args) {
        System.out.println("BruteForce Approach");
        Solution s = new BruteForceSolution();
        System.out.println(s.getLengthOfLongestSubstringWithoutRepeatingCharacter("abcaabcdba"));
        System.out.println("----------------------------");

        System.out.println("Better Approach");
        s = new BetterSolution();
        System.out.println(s.getLengthOfLongestSubstringWithoutRepeatingCharacter("abcaabcdba"));
        System.out.println("----------------------------");

        System.out.println("Optimal Approach");
        s = new OptimalSolution();
        System.out.println(s.getLengthOfLongestSubstringWithoutRepeatingCharacter("abcaabcdba"));
        System.out.println("----------------------------");
    }
}
