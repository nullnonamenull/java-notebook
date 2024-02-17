package com.poleszak.insertionSort;

import com.poleszak.common.DataPreparation;
import com.poleszak.common.Timer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = DataPreparation.getSimpleNumbers();
        int[] randomNumbers = DataPreparation.getRandomNumbers();

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("STARTING SORT");

        long startTime = Timer.getActualTime();
        InsertionSort.sort(numbers);
        long endTime = Timer.getActualTime();
        System.out.println("Took " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        InsertionSort.sort(randomNumbers);
        endTime = System.currentTimeMillis();
        System.out.println("Took " + (endTime - startTime) + "ms");

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomNumbers));
    }
}
