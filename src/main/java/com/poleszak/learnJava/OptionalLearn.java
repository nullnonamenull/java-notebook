package com.poleszak.learnJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalLearn {

    public static void learnOptional() {

        List<Optional<Integer>> optionalList = getRandomValue();
        for (Optional<Integer> optionalI1 : optionalList) {
            optionalI1.ifPresent(System.out::println);
        }

        System.out.println("\n");

        for (Optional<Integer> optionalI1 : optionalList) {
            System.out.println(optionalI1.orElse(100));
        }
    }

    private static List<Optional<Integer>> getRandomValue() {
        Random random = new Random();
        List<Optional<Integer>> optionalIs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(1000);
            optionalIs.add(val % 2 == 0 ? Optional.of(random.nextInt(101)) : Optional.empty());
        }
        return optionalIs;
    }
}
