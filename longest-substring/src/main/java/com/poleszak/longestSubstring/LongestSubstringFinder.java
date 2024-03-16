package com.poleszak.longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringFinder {

    /*
    Algorithm: Brute Force
    Complexity: O(n²)
    */
    public static int lengthOfLongestSubstringBruteForce(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }

                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }

        return maxLength;
    }

    /*
   Algorithm: Sliding Window Algorithm
   Complexity: O(n)
   */
    public static int lengthOfLongestSubstringFast(String s) {
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

    public static int lengthOfLongestSubstringSpeedy(String s) {
        int maxLength = 0;


        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);

            if (indexOfFirstAppearanceInSubstring != right) {
                left = indexOfFirstAppearanceInSubstring + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}