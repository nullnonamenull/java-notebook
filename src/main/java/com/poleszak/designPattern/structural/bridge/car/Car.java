package com.poleszak.designPattern.structural.bridge.car;

public abstract class Car {
    protected AudioSystem audioSystem;

    public Car(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }
}