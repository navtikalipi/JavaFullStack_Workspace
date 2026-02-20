package com.example.thread;

public class MyTask implements Runnable { //Only a class that implements the Runnable interface
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
