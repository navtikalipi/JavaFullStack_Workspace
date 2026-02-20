package com.example.core;

class Course {
    int id;
    String title;

    Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void displayCourse() {
        System.out.println("com.example.core.Course ID: " + id);
        System.out.println("com.example.core.Course Title: " + title);
    }
}
