package com.poleszak.common;

import java.util.Random;

public class DataPreparation {

    public static int[] getRandomNumbers() {
        int[] randomNumbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10001);
        }

        return randomNumbers;
    }

    public static int[] getSimpleNumbers() {
        return new int[]{18, 1, 8, 36, 1, 2, 3, 4, 5};
    }
}