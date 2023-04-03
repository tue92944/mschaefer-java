package org.example;

public class Student {
    private Person name;
    private double GPA;

    private Person homeroomTeacher;

    public Person getName() {
        return name;
    }

    public void setName(Person name) {
        this.name = name;
    }

    public Person getHomeroomTeacher() {
        return homeroomTeacher;
    }

    public void setHomeroomTeacher(Person homeroomTeacher) {
        this.homeroomTeacher = homeroomTeacher;
    }


    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
