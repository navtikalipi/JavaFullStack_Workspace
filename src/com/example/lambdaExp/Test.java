package com.example.lambdaExp;

import com.example.oops.Interface.Person;

public class Test {
    public static void main(String[] args){
        //Person p =new Person();
        //Normal implementation from Person class
        //p.greet();

        Greeting g = new Greeting() { //All methods of this interface needs to be implemented
            @Override
            public void greet() {

            }

//            @Override
//            public void namaste() {
//
//            }
        }; //Anonymous class--only for abstract classes or Interfaces

        g.greet(); //use obj g created

        //Lambda expressions- works with only Functional Interface
        // (arguments)->{ body }
        //{return <valid datatype variable>}

        //Does the same thing as anonymous class
        Greeting g1=()->{
            System.out.println("Greetings");
        };
        g1.greet();


    }
}
