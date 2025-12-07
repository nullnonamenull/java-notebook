package com.noname;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj dolny próg: ");
            int min = scanner.nextInt();
            System.out.print("Podaj górny próg: ");
            int max = scanner.nextInt();

            System.out.printf("W podanym przedziale jest %s liczb nieparzystych.%n", oddNumberCounter(min, max));
        }
    }

    public static int oddNumberCounter(int min, int max) {
        if ((min & 1) == 0) {
            min++;
        }

        return min > max ? 0 : (max - min) / 2 + 1;
    }
}