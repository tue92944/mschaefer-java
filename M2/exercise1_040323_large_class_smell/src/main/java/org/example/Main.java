package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        ConsoleIO.display("Welcome to Better School Tracker!");

        Person studentName = new Person();
        studentName.setFirstName(ConsoleIO.promptString("Enter Student First Name"));
        studentName.setLastName(ConsoleIO.promptString("Enter Student Last Name"));
        student.setName(studentName);

        student.setGPA(ConsoleIO.promptDouble("Enter Student's GPA"));

        Person homeroomTeacher = new Person();
        homeroomTeacher.setFirstName(ConsoleIO.promptString("Enter Homeroom teacher's first Name"));
        homeroomTeacher.setLastName(ConsoleIO.promptString("Enter Homeroom teacher's last name"));
        student.setHomeroomTeacher(homeroomTeacher);

        System.out.println("Student: " + student.getName().getFirstName() + " " + student.getName().getLastName());
        System.out.println("GPA: " + student.getGPA());
        System.out.println("Homeroom Teacher: " + student.getHomeroomTeacher().getFirstName() + " " + student.getHomeroomTeacher().getLastName());

    }
}