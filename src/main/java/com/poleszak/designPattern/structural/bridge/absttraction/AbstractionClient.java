package com.poleszak.designPattern.structural.bridge.absttraction;

public class AbstractionClient {
    public static void client() {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new ConcreteAbstraction(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction = new ConcreteAbstraction(implementor);
        abstraction.operation();
    }
}
