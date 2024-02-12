package com.poleszak.longestSubstring.tools;

import java.util.HashMap;
import java.util.Map;

public class FastSubstringFinder {


    /*
    Algorithm: Sliding Window Algorithm
    Complexity: O(n²)
    */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> checkedCharacters = new HashMap<>();


        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            if (checkedCharacters.containsKey(currentCharacter) &&
                    checkedCharacters.get(currentCharacter) >= left) {
                left = checkedCharacters.get(currentCharacter) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            checkedCharacters.put(currentCharacter, right);
        }

        return maxLength;
    }
}
