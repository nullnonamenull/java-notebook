package com.poleszak.learnJava.multithreading;

public class MultithreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
