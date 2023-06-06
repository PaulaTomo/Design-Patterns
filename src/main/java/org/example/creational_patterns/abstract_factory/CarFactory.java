package org.example.creational_patterns.abstract_factory;

public class CarFactory {
    private CarFactory(){

    }

    public static  Car buildCar(CarType type){
        Car car = null;
        Location location = Location.INDIA;

        switch (location){
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;

            case INDIA :
                car = IndiaCarFactory.builderCar(type);
            break;

            case DEFAULT:
                car = DefaultCarFactory.buildCar(type);


        }
        return car;
    }

}
