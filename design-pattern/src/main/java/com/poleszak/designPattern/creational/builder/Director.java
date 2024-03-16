package com.poleszak.designPattern.creational.builder;


import com.poleszak.designPattern.creational.builder.model.Builder;

public class Director {

    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLamborghini(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Blue")
                .height(120);
    }

}
