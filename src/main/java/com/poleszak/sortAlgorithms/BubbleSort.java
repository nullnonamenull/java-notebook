package com.poleszak.sortAlgorithms;

public class BubbleSort {

    public static void sort(int[] numbers) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(int[] numbers, int i, int b) {
        int temp = numbers[i];
        numbers[i] = numbers[b];
        numbers[b] = temp;
    }
}
