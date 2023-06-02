package org.example.creational_patterns;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private int id;
    private String name;
    private String address;


    private static Student instance;

    public StudentBuilder builder() {
        return new StudentBuilder();
    }

    public String getInfo() {
        return "id = " + this.id + " name = " + this.name + " address : " + this.address;
    }


    //Singleton
    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }


}


