package com.poleszak.longestSubstring;

import com.poleszak.longestSubstring.tools.LongestSubstringFinder;

public class Main {

    public static void main(String[] args) {
        String str = "abcabcfdssdfsdfsadfasdfsadfabcabcd";


        LongestSubstringFinder bruteForceSubstringFinder = new LongestSubstringFinder();

        int maxLengthBruteForceMethod = bruteForceSubstringFinder.lengthOfLongestSubstringBruteForce(str);
        int maxLengthFastMethod = bruteForceSubstringFinder.lengthOfLongestSubstringFast(str);
        int maxLengthSpeedyMethod = bruteForceSubstringFinder.lengthOfLongestSubstringSpeedy(str);


        System.out.println(maxLengthBruteForceMethod);
        System.out.println(maxLengthFastMethod);
        System.out.println(maxLengthSpeedyMethod);
    }
}
