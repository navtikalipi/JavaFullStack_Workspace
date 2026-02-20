package com.example.thread.shareddata;

public class PrintEvenNum {
    static int i; //shared resource, thread issue, hence using static to take the example

    public synchronized void printNum(){ //used for shared resources to have control to each thread
        for(i=0;i<=20;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

        }
    }
}
