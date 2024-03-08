package com.poleszak.designPattern.structural.bridge.car;

public class CarClient {
    public static void client() {
        AudioSystem audioSystem = new StandardAudioSystem();
        Car car = new ConcreteCar(audioSystem);
        car.getAudioSystem().play();

        audioSystem = new PremiumAudioSystem();
        car = new ConcreteCar(audioSystem);
        car.getAudioSystem().play();
    }
}
