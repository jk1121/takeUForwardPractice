package takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl;

import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.Solution;
import utils.Utility;

import java.util.HashSet;
import java.util.Set;

/**
 * created by JK
 * on 30/04/23
 **/

public class BruteForceSolution implements Solution {
    @Override
    public int getLengthOfLongestSubstringWithoutRepeatingCharacter(String s) {
        int len = s.length();
        int maxLen = Integer.MIN_VALUE;

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                char x = s.charAt(j);
                if (set.contains(x)) {
                    maxLen = Utility.MaxOf(j - i + 1, maxLen);
                    break;
                }
                set.add(x);
            }
        }

        return maxLen;
    }
}
