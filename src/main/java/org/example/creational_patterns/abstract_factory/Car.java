package org.example.creational_patterns.abstract_factory;

abstract class Car {


    Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    CarType model = null;
    Location location = null;

    public String toString() {
        return "CarModel : " + model + " located in " + location;
    }


    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    Location getLocation() {
        return location;
    }
}
