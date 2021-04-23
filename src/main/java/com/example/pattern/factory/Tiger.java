package com.example.pattern.factory;

public class Tiger implements Animal{
    public Tiger(Object tiger) {
    }

    public Tiger() {

    }

    @Override
    public boolean makeSound() {
        return true;
    }

    @Override
    public boolean isPet() {
        return false;
    }

    @Override
    public Animal clone() {
        return new Tiger(this);
    }
}
