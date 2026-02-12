package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {
        System.out.println("Book Object Created");
    }

    // accepts nothing and returns nothing
    public void show() {
        System.out.println("Id: " + id + " Title: " + title + " Author: " + author);
    }

    public void show1(String x) {
        System.out.println("Id: " + id + " Title: " + title + " Author: " + author);
        System.out.println(x);
    }

    public String show2(String x) {
        System.out.println("Id: " + id + " Title: " + title + " Author: " + author);
        return x;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Java", "James Gosling"));
        books.add(new Book(2, "Python", "Guido van Rossum"));
        books.add(new Book(3, "C++", "Bjarne Stroustrup"));

        Iterator<Book> itr = books.iterator();

        while (itr.hasNext()) {
            Book b = itr.next();
            b.show();   // using instance method
        }
    }
}
