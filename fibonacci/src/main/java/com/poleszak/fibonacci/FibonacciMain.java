package com.poleszak.fibonacci;

public class FibonacciMain {
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 20;
        fibonacciCache = new long[n + 1];

        System.out.println(fibonacciNotOptimal(n));
        System.out.println(fibonacciOptimal(n));

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciOptimal(i));
        }
    }

    public static long fibonacciNotOptimal(int n) {
        if (n <= 1) return n;
        return (fibonacciNotOptimal(n - 1) + fibonacciNotOptimal(n - 2));
    }

    public static long fibonacciOptimal(int n) {
        if (n <= 1) return n;
        if (fibonacciCache[n] != 0) return fibonacciCache[n];

        long nthFibonacciNumber = (fibonacciOptimal(n - 1) + fibonacciOptimal(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}