package com.poleszak.pattern.structural.proxy.subject;

public class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if (checkAccess()) {
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            realSubject.request();
            logAccess();
        }
    }

    private boolean checkAccess() {
        System.out.println("Proxy: Checking access before firing a real request.");
        return true;
    }

    public void logAccess() {
        System.out.println("Proxy: Logging the time of request.");
    }
}
