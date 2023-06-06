package org.example.creational_patterns.abstract_factory;

public class IndiaCarFactory {
    static Car builderCar(CarType model){
        Car car = null;
        switch (model){
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }
}
