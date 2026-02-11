package com.example.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("My.txt")){; //,true)) {

            String content = "Hello, how are you\n";
            fw.write(content);

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
