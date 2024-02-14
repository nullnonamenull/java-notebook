package com.poleszak.learnJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndHashSet {

    public static void learnSets() {
        /*
            - Set do not allowed duplicates - all values are unique
                names.add("Pieter");
                names.add("Pieter");
                it shows Pieter only one time
            - In Sets is not possible to remove element by index
                names.remove(1);
                elements in Set are not in particular order

            - Implementations:
                            - HashSet
                            - TreeSet
                            - LinkedHashSet

            - HashSet:
                    - HashSet implementation uses a hash table as its storage mechanism
                    - Uses HashTable - HashMap instance
                    - HashTable - Extremely fast operations
                    - Operations takes constant amount time
            TreeSet:
                    - Elements will be ordered - their natural ordering
                    - Uses TreeMap
                    - Much slower than HashSet - log(n)

            LinkedHashSet:
                    - Exact same order that elements were added
                    - Almost as fast as a HashSet
                    - Uses HashMap and LinkedList

            - When?
                - don't care about order
                - don't want duplicates
         */
        Set<String> names = getNamesAsSet();

        names.remove("Pieter");

        System.out.println(names);
        System.out.println("Set size: " + names.size());
        System.out.println("Does Set contain name 'Pawlo': " + names.contains("Pawlo"));
        System.out.println("Does Set is empty: " + names.isEmpty());
        names.clear();
        System.out.println("Does Set is empty: " + names.isEmpty());

        // ---------------------------------------------------------------------------------------------

        List<Integer> numbers = getNumbersAsList();
        System.out.println(numbers);
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println(numberSet);

    }

    private static Set<String> getNamesAsSet() {
        Set<String> names = new HashSet<>();

        names.add("Pieter");
        names.add("Pawlo");
        names.add("Marko");
        names.add("Franek");
        return names;
    }

    private static List<Integer> getNumbersAsList() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        return numbers;
    }
}