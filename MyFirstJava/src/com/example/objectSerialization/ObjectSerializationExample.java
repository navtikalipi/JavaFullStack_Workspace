package com.example.objectSerialization;

import java.io.*;

public class ObjectSerializationExample {
    public static void main(String[] args) {
        try {
            Product prod1 = new Product(1, "TV", 2);
            FileOutputStream fos = new FileOutputStream("myobj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream("myobj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(prod1);
            System.out.println("Object is serialized");
            System.out.println("Start deserializatiom");
            Product prodCopy = (Product) ois.readObject();
            System.out.println(prodCopy);
        } catch (IOException e) {
            System.out.println("Error");
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        }
    }
}
