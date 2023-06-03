package takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl;

import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.Solution;
import utils.Utility;

import java.util.HashSet;
import java.util.Set;

/**
 * created by JK
 * on 30/04/23
 **/

public class BetterSolution implements Solution {
    @Override
    public int getLengthOfLongestSubstringWithoutRepeatingCharacter(String s) {
        int left = 0;
        int len = s.length();
        int maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < len; right++) {
            char x = s.charAt(right);
            if (set.contains(x)) {
                while (left < right && set.contains(x)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(x);
            maxLen = Utility.MaxOf(maxLen, right - left + 1);

        }

        return maxLen;
    }
}
