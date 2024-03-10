package org.example.lesson3.task1.hw.task1;

import java.io.Serializable;

public class UserData implements Serializable {
    private String name;
    private int age;
    transient double GPA;

    public UserData(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }
}
