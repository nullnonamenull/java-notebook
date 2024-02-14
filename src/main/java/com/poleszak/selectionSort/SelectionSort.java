package com.poleszak.selectionSort;

public class SelectionSort {

    /*
    Algorithm: Selection Sort
    Complexity: O(n²)
    */
    public static void sort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int i, int b) {
        int temp = numbers[i];
        numbers[i] = numbers[b];
        numbers[b] = temp;
    }
}
