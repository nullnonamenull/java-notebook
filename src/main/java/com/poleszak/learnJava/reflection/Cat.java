package com.poleszak.learnJava.reflection;

public class Cat {

    private final int age;
    private final String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
        this.name = "Maniek";
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private void meow() {
        System.out.println("MEOW");
    }

    private static void staticMeow() {
        System.out.println("MeowMeow");
    }


}