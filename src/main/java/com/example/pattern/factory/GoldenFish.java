package com.example.pattern.factory;

public class GoldenFish implements Animal {
    public GoldenFish(Object goldenFish) {
    }

    public GoldenFish() {

    }

    @Override
    public boolean makeSound() {
        return false;
    }

    @Override
    public boolean isPet() {
        return true;
    }

    @Override
    public Animal clone() {
        return new GoldenFish(this);
    }
}
