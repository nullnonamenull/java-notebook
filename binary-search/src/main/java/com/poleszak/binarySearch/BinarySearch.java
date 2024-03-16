package com.poleszak.binarySearch;

public class BinarySearch {

    public static int search(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleNumber = numbers[middleIndex];

            if (numberToFind == middleNumber) {
                return middleIndex;
            }
            if (numberToFind < middleNumber) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }
        return -1;
    }
}