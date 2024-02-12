package com.poleszak.longestSubstring;

import com.poleszak.longestSubstring.tools.BruteForceSubstringFinder;
import com.poleszak.longestSubstring.tools.FastSubstringFinder;

public class Main {

    public static void main(String[] args) {
        BruteForceSubstringFinder bruteForceSubstringFinder = new BruteForceSubstringFinder();
        FastSubstringFinder fastSubstringFinder = new FastSubstringFinder();

        int maxLengthBruteForceMethod = bruteForceSubstringFinder.lengthOfLongestSubstring("abcabcfdssdfsdfsadfasdfsadfabcabcd");
        int maxLengthFastMethod = fastSubstringFinder.lengthOfLongestSubstring("abcabcfdssdfsdfsadfasdfsadfabcabcd");


        System.out.println(maxLengthBruteForceMethod);
        System.out.println(maxLengthFastMethod);
    }
}
