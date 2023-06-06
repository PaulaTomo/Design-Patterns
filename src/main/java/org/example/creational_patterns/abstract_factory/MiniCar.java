package org.example.creational_patterns.abstract_factory;

public class MiniCar extends Car {
    MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to Mini Car");
    }
}
