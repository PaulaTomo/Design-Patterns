package org.example;

import org.example.creational_patterns.factoryMethod.MacOsNotifier;
import org.example.creational_patterns.factoryMethod.Notifier;
import org.example.creational_patterns.factoryMethod.WindowsNotifier;
import org.example.creational_patterns.Student;

public class Main {
    private static Notifier notifier;
    public static void main(String[] args) {

        Student studentOne = Student.getInstance().builder()
                .id(1)
                .name("Will")
                .address("Paris, n.2, street : Nostradamus")
                .build();
        System.out.println(studentOne.getInfo());

        Student studentTwo = Student.getInstance().builder()
                .id(2)
                .name("Ioana")
                .address("Bucharest, nr 12, street : Cogalniceanu")
                .build();
        System.out.println(studentTwo.getInfo());


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