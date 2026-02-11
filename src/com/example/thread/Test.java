package com.example.thread;

public class Test {
    public static void main(String[] args) {
        MyThread t1=new MyThread();//directly
            t1.start(); //calls the run method from the thread class

        MyTask my=new MyTask();
        Thread t2=new Thread(my);
        t2.start();
    }
}
