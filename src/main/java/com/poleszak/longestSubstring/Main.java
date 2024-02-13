package com.poleszak.longestSubstring;

import com.poleszak.longestSubstring.tools.LongestSubstringFinder;

public class Main {

    public static void main(String[] args) {
        String str = "abcabcfdssdfsdfsadfasdfsadfabcabcd";

        int maxLengthBruteForceMethod = LongestSubstringFinder.lengthOfLongestSubstringBruteForce(str);
        int maxLengthFastMethod = LongestSubstringFinder.lengthOfLongestSubstringFast(str);
        int maxLengthSpeedyMethod = LongestSubstringFinder.lengthOfLongestSubstringSpeedy(str);

        System.out.println(maxLengthBruteForceMethod);
        System.out.println(maxLengthFastMethod);
        System.out.println(maxLengthSpeedyMethod);
    }
}