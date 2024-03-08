package com.poleszak.designPattern.structural.bridge;

public class ConcreteAbstraction extends Abstraction {
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }
}