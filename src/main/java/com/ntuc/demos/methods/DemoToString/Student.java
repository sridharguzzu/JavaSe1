package com.ntuc.demos.methods.DemoToString;

/**
 *
 * @author Sridhar Guzzu
 */
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return String.format("%-4d: %s", id, name);
    }
}
