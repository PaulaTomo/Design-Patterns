package org.example.creational_patterns.factoryMethod;

import org.example.creational_patterns.factoryMethod.interfaces.Notifiable;

import java.awt.*;

public class WindowsNotification implements Notifiable {
    public void display() {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().getImage("");

            TrayIcon trayIcon = new TrayIcon(image, "Windows notifier");

            trayIcon.setImageAutoSize(true);

            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("An error occurred while adding icon to tray. Please check if tray is available");

            }
            trayIcon.displayMessage("Hello" ," this is your java project sending a notification", TrayIcon.MessageType.INFO);

        } else {
            System.err.println("Tray not supported");
        }
    }
}

