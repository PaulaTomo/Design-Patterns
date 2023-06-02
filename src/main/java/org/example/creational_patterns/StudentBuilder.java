package org.example.creational_patterns;

public class StudentBuilder extends Student {
    private int id;
    private String name;
    private String address;


    public StudentBuilder id(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        Student student = Student.getInstance();
        student.setId(this.id);
        student.setName(this.name);
        student.setAddress(this.address);
        return student;
    }
}

