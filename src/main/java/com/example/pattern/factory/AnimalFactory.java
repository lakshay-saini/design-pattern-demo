package com.example.pattern.factory;

import java.util.Objects;

public class AnimalFactory {

    // inner class implementation for thread safety
    // lazy initialized class
    private static class AnimalFactorySingleton{
        private static final AnimalFactory INSTANCE = new AnimalFactory();
    }

    private AnimalFactory() {
        if(Objects.nonNull(AnimalFactorySingleton.INSTANCE)) {
            throw new UnsupportedOperationException();
        }
    }

    // method is to get singleton object of class {@AnimalSingleton}
    public static AnimalFactory getInstance() {
        return AnimalFactorySingleton.INSTANCE;
    }

    // prevention from serialization/de-serialization
    public Object readResolve() {
        return this;
    }

    // prevention from cloning
    @Override
    public Object clone() {
        return this;
    }

    public Animal getAnimal(String name) {
        if("GoldenFish".equals(name)) {
            return new GoldenFish();
        } else if("Dog".equals(name)) {
            return new Dog();
        } else if ( "Tiger".equals(name)) {
            return new Tiger();
        } else {
            throw new IllegalArgumentException("invalid name provided for an animal");
        }
    }
}
