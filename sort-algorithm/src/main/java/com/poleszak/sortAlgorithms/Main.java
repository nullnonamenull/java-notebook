package com.poleszak.sortAlgorithms;

import com.poleszak.common.DataPreparation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        int[] randomNumbers = DataPreparation.getRandomNumbers();

        Class<?>[] sortClasses = {
                QuickSort.class,
                InsertionSort.class,
                SelectionSort.class,
                BubbleSort.class,
                MergeSort.class
        };

        for (Class<?> sortClass : sortClasses) {
            runSortAlgorithm(sortClass, randomNumbers.clone(), "sort");
        }
    }

    public static void runSortAlgorithm(Class<?> sortClass, int[] array, String methodName) {
        try {
            Method sortMethod = sortClass.getDeclaredMethod(methodName, int[].class);

            long startTime = System.currentTimeMillis();
            sortMethod.invoke(null, array);
            long endTime = System.currentTimeMillis();

            System.out.println(sortClass.getSimpleName() + ": Took " + (endTime - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
