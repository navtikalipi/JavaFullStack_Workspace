package com.example.thread.shareddata;

public class Thread1 extends Thread{
    PrintEvenNum obj;
    public Thread1(PrintEvenNum obj){
        this.obj=obj;
    }

    @Override
    public void run() {
        obj.printNum(); //executed as thread task
    }
}
