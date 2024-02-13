package com.poleszak.binarySearch;

import com.poleszak.binarySearch.tools.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 4, 5, 6, 7, 8};

        int indexCustomMethod = BinarySearch.search(ints, 6);
        int indexArraysMethod = Arrays.binarySearch(ints, 6);

        System.out.println(indexCustomMethod);
        System.out.println(indexArraysMethod);
    }
}
