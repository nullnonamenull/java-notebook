package com.poleszak.common;

import java.util.Random;

public class DataPreparation {

    public static int[] getRandomNumbers() {
        int[] randomNumbers = new int[1000000];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10001);
        }

        return randomNumbers;
    }
}