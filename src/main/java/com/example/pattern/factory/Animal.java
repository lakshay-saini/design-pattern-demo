package com.example.pattern.factory;

public interface Animal {

    boolean makeSound();
    boolean isPet();
    default String getName() {
        return this.getClass().getSimpleName();
    }
}
