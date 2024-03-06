package com.poleszak.pattern.structural.proxy.subject;

public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("RealSubjects: Handling request.");
    }
}
