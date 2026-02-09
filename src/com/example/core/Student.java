package com.example.core;

class Student {
    int id;
    String name;
    Course course;   // com.example.core.Course as an object

    Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("com.example.core.Student ID: " + id);
        System.out.println("com.example.core.Student Name: " + name);
        System.out.println("com.example.core.Course ID: " + course.id);
        System.out.println("com.example.core.Course Title: " + course.title);
    }

    public static void main(String[] args) {
        Course c1 = new Course(101, "Java Programming");
        Student s1 = new Student(1, "Navlipi", c1);
        s1.displayStudent();
    }
}
