package com.poleszak.designPattern.structural.bridge;

import com.poleszak.designPattern.structural.bridge.absttraction.AbstractionClient;
import com.poleszak.designPattern.structural.bridge.car.CarClient;

public class Main {

    public static void main(String[] args) {
        /*
         *   Splits a large class into two
         *   separate hierarchies which can
         *   be developed independently
         * */
        AbstractionClient.client();
        CarClient.client();
    }
}
