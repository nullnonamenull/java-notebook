package com.poleszak.selectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 6, 3, 8, 10, 2};
        int[] randomNumbers = new int[1000];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("STARTING SORT");

        long startTime = System.currentTimeMillis();
        SelectionSort.sort(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        SelectionSort.sort(randomNumbers);
        endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) + "ms");

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomNumbers));
    }
}