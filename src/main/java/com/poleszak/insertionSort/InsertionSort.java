package com.poleszak.insertionSort;

public class InsertionSort {

    /*
    Algorithm: Insertion Sort
    Complexity: O(n²)
    */
    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = temp;
        }
    }
}
