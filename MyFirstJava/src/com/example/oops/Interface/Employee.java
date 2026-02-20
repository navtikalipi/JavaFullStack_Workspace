package com.example.oops.Interface;

public class Employee extends Person implements Artist {
    int empID;
    public Employee() {}

    @Override
    public void doArt(){

    }

    @Override
    public void do1() {
        //Here Doable is a parent of the Interface Artist, but we are not implementing here hence we have to put the method of the parent interface
    }
}
