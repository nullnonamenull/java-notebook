package com.poleszak.designPattern.structural.decorator;

import com.poleszak.designPattern.structural.decorator.model.BasicCar;
import com.poleszak.designPattern.structural.decorator.model.Car;
import com.poleszak.designPattern.structural.decorator.model.LuxuryCar;
import com.poleszak.designPattern.structural.decorator.model.SportsCar;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
