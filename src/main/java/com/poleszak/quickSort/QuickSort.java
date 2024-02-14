package com.poleszak.quickSort;

public class QuickSort {

    public static void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

//        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
//        int pivot = numbers[pivotIndex];
//        swap(numbers, pivotIndex, highIndex);

        int pivot = numbers[highIndex];
        int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

        sort(numbers, lowIndex, leftPointer - 1);
        sort(numbers, leftPointer + 1, highIndex);
    }

    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(numbers, leftPointer, rightPointer);
        }

        swap(numbers, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}