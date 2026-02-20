package com.example.oops.Interface;

public class Test {
    public static void main(String[] args){
        Employee e= new Employee();//pure implementation
        Person p=new Employee(); //Abstract class or Polymorphic implementation
        Artist a=new Employee();

        e.doArt();
        e.do1();
        //gets the method access, check rest accordingly


    }
}
