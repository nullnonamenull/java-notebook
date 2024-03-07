package com.poleszak.designPattern.creational.singleton;

public class EagerLoadingLogger {
    private static final EagerLoadingLogger instance = new EagerLoadingLogger();

    private EagerLoadingLogger() {
    }

    public static EagerLoadingLogger getInstance() {
        return instance;
    }
}
