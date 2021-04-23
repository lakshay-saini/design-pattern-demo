package com.example.pattern.factory;

public class Dog implements Animal {

    private final String name;

    private Dog(Dog dog) {
        this.name = dog.name;
    }

    public Dog() {
        this.name = this.getClass().getSimpleName();
    }

    private Dog(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public boolean makeSound() {
        return true;
    }

    @Override
    public boolean isPet() {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

    public static class Builder {
        private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
