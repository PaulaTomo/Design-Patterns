package org.example.creational_patterns.factoryMethod;

import org.example.creational_patterns.factoryMethod.interfaces.Notifiable;

public class MacOsNotifier extends Notifier{
    @Override
    public Notifiable createNotification() {
        return new MacOsNotification();
    }
}
