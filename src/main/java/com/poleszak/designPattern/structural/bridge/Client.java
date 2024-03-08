package com.poleszak.designPattern.structural.bridge;

public class Client {
    public static void client() {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new ConcreteAbstraction(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction = new ConcreteAbstraction(implementor);
        abstraction.operation();
    }
}
