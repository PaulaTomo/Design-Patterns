package org.example.creational_patterns.factoryMethod;

import org.example.creational_patterns.factoryMethod.interfaces.Notifiable;


public  abstract  class Notifier {
    public void sendNotification(){
        Notifiable notification = createNotification();
        notification.display();
    }

  public abstract Notifiable createNotification();

}
