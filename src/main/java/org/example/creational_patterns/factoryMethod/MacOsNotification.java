package org.example.creational_patterns.factoryMethod;

import org.example.creational_patterns.factoryMethod.interfaces.Notifiable;

public class MacOsNotification implements Notifiable {
    @Override
    public void display() {
        System.out.println("MacOS notification.");
    }
}
