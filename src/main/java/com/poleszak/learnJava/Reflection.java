package com.poleszak.learnJava;

import com.poleszak.learnJava.reflection.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public static void learnReflection() {
        Cat cat = new Cat(786, "Yoshimitsu");


        Field[] fields = cat.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

        System.out.println("\n\nBefore change by reflection:");
        System.out.println(cat.getName());

        for (Field field : fields) {
            if (field.getName().equals("name")) {
                try {
                    field.setAccessible(true);
                    field.set(cat, "Woody");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("After change by reflection:");
        System.out.println(cat.getName());

        Method[] methods = cat.getClass().getDeclaredMethods();

        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));

        System.out.println("\nInvoke private method by reflection:");
        for (Method method : methods) {
            if (method.getName().equals("meow")) {
                method.setAccessible(true);
                try {
                    method.invoke(cat);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } else if (method.getName().equals("staticMeow")) {
                method.setAccessible(true);
                try {
                    method.invoke(null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}