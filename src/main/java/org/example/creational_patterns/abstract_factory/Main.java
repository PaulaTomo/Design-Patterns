package org.example.creational_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));

    }
}
