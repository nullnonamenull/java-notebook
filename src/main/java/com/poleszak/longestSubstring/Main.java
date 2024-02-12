package com.poleszak.longestSubstring;

import com.poleszak.longestSubstring.tools.BruteForceSubstringFinder;
import com.poleszak.longestSubstring.tools.FastSubstringFinder;
import com.poleszak.longestSubstring.tools.SpeedySubstringFinder;

public class Main {

    public static void main(String[] args) {
        String str = "abcabcfdssdfsdfsadfasdfsadfabcabcd";


        BruteForceSubstringFinder bruteForceSubstringFinder = new BruteForceSubstringFinder();
        FastSubstringFinder fastSubstringFinder = new FastSubstringFinder();
        SpeedySubstringFinder speedySubstringFinder = new SpeedySubstringFinder();

        int maxLengthBruteForceMethod = bruteForceSubstringFinder.lengthOfLongestSubstring(str);
        int maxLengthFastMethod = fastSubstringFinder.lengthOfLongestSubstring(str);
        int maxLengthSpeedyMethod = speedySubstringFinder.lengthOfLongestSubstring(str);


        System.out.println(maxLengthBruteForceMethod);
        System.out.println(maxLengthFastMethod);
        System.out.println(maxLengthSpeedyMethod);
    }
}
