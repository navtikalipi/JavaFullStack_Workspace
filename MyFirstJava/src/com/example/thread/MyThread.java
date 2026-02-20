package com.example.thread;

public class MyThread extends Thread{ //thread since it is a child of thread class
    @Override
    public void run() {
        for(int i =0; i<10; i++){
            System.out.println(i);
        }
    }
}
