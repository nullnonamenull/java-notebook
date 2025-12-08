package com.poleszak;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSquareSumTriples(10));
        System.out.println(countSquareSumTriples(5));
    }

    public static  int countSquareSumTriples(int n) {
        int counter = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if ((a * a + b * b) == c * c) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}