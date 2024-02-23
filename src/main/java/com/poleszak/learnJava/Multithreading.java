package com.poleszak.learnJava;

import com.poleszak.learnJava.multithreading.MultithreadExtendsThread;
import com.poleszak.learnJava.multithreading.MultithreadImplementsRunnable;

public class Multithreading {

    public static void learnMultithreading() {
        MultithreadExtendsThread multithreadThing = new MultithreadExtendsThread();
        MultithreadExtendsThread multithreadThingSecond = new MultithreadExtendsThread();

        MultithreadImplementsRunnable implementsRunnable = new MultithreadImplementsRunnable();
        MultithreadImplementsRunnable implementsRunnableSecond = new MultithreadImplementsRunnable();
        Thread threadOne = new Thread(implementsRunnable);
        Thread threadTwo = new Thread(implementsRunnable);

        multithreadThing.start();
        multithreadThingSecond.start();

        threadOne.start();
        threadTwo.start();

        System.out.println(threadOne.isAlive());
        System.out.println(threadTwo.isAlive());
    }
}
