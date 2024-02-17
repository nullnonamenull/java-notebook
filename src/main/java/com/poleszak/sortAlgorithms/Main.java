package com.poleszak.sortAlgorithms;

import com.poleszak.common.DataPreparation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] randomNumbers = DataPreparation.getRandomNumbers();

        Class<?>[] sortClasses = {
                QuickSort.class,
                InsertionSort.class,
                SelectionSort.class,
                BubbleSort.class
        };

        for (Class<?> sortClass : sortClasses) {
            runSortAlgorithm(sortClass, randomNumbers.clone(), "sort");
        }
    }

    public static void runSortAlgorithm(Class<?> sortClass, int[] array, String methodName) {
        try {
//            System.out.println("LIST BEFORE SORT: " + Arrays.toString(array));
            Method sortMethod = sortClass.getDeclaredMethod(methodName, int[].class);

            long startTime = System.currentTimeMillis();
            sortMethod.invoke(null, (Object) array);
            long endTime = System.currentTimeMillis();

            System.out.println(sortClass.getSimpleName() + ": Took " + (endTime - startTime) + "ms");
//            System.out.println("LIST AFTER SORT: " + Arrays.toString(array) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
