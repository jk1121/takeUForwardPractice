package takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.impl;

import takeUForward.striversSheet.arrayspart4.longestSubstringWithoutRepeatingCharacter.Solution;
import utils.Utility;

import java.util.HashMap;
import java.util.Map;

/**
 * created by JK
 * on 30/04/23
 **/

public class OptimalSolution implements Solution {
    @Override
    public int getLengthOfLongestSubstringWithoutRepeatingCharacter(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char x = s.charAt(right);
            if (map.containsKey(x)) {
                left = Utility.MaxOf(left, map.get(x) + 1);
            }
            map.put(x, right);
            maxLen = Utility.MaxOf(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
