package com.poleszak.learnjava;

import java.util.HashMap;

public class MapAndHashMap {

    public static void learnMaps() {
         /*
            Map is just a set of key/value pairs.
            Each key and value pair is known as an entry.

            A Map is useful if you have to search, update or delete elements on the basis of a key.
            There are two interfaces for implementing Map in java:
                                                                    - Map
                                                                    - SortedMap,
            and three classes:
                                - HashMap,
                                - LinkedHashMap,
                                - TreeMap

            - HashMap:
                                - HashMap is the implementation of Map, but it doesn't maintain any order
            - LinkedHashMap:
                                - LinkedHashMap is the implementation of Map. It inherits HashMap class.
                                - Maintains insertion order
            - TreeMap:
                                - TreeMap is the implementation of Map and SortedMap.
                                - It maintains ascending order.



         */

        // Integers are the keys - Strings are the values
        HashMap<Integer, String> empIds = new HashMap<>();

        empIds.put(1234, "Pieter");
        empIds.put(1235, "Mario");
        empIds.put(12346, "Juan");
        empIds.put(12345, "Pablo");

        /*
            will not be added
            empIds.put(12345, "Pablo");
        */

        System.out.println(empIds);

        System.out.println(empIds.get(1234));

        System.out.println(empIds.containsKey(12345));
        System.out.println(empIds.containsKey(543));

        System.out.println(empIds.containsValue("Juan"));
        System.out.println(empIds.containsValue("Jon"));

        // will update value (name) with 1234 key (id)
        empIds.put(1234, "Marko");
        System.out.println(empIds);

        // if not exist will do nothing - not as .put
        empIds.replace(1234, "Franko");
        System.out.println(empIds);

        // will add if key not exist
        empIds.putIfAbsent(1237, "Mario");
        empIds.putIfAbsent(1234, "Mario");
        System.out.println(empIds);
    }
}
