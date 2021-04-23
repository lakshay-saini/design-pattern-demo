package com.example.pattern.factory;

import java.util.Objects;

public class FactoryTest {

    public static void main(String[] args) {

        AnimalFactory animalFactory = AnimalFactory.getInstance();
        Animal dog = animalFactory.getAnimal("Dog");

        System.out.println("is dog = " + dog.getName().equals("Dog"));
        System.out.println("is dog pet = " + Objects.equals(dog.isPet(), Boolean.TRUE));
        System.out.println("is dog make sound= " + Objects.equals(dog.makeSound(), Boolean.TRUE));
    }
}
