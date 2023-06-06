package org.example.creational_patterns.factoryMethod;

public class Main {
    private static Notifier notifier;

    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        switch (osName){
            case "Mac OS X":
                notifier = new MacOsNotifier();
                break;
            case "Windows 11" :
                notifier = new WindowsNotifier();
                break;

        }
        notifier.sendNotification();
    }
}
