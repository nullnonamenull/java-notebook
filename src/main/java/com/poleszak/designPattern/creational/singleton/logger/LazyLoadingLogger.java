package com.poleszak.designPattern.creational.singleton.logger;

public class LazyLoadingLogger {
    private static LazyLoadingLogger instance;

    private LazyLoadingLogger() {
    }

    public static LazyLoadingLogger getInstance() {
        if (instance == null) {
            instance = new LazyLoadingLogger();
        }
        return instance;
    }
}
