package com.poleszak.designPattern.creational.builder;

import com.poleszak.designPattern.creational.builder.model.CarBuilder;
import com.poleszak.designPattern.creational.builder.model.CarSchemaBuilder;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.height(888));
        System.out.println(builder.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLamborghini(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());
    }
}
