package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list=new ArrayList(); // OR Use List which is an interface, implementing ArrayList which is a class
        list.add("Navtika");
        list.add(11);//Integer
        list.add(false);//Boolean
        list.add(11.11);//Double
        System.out.println(list);

        List<String> list1=new ArrayList();
        list1.add("Upasana");//String
        list1.add("Rita");//Integer
        list1.add("Gita");//Boolean
        list1.add("Virat");//Double
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        List<Book> bookList=new ArrayList();
        Book b2=new Book(100,"Java","James Gosling");
        bookList.add(b2);
        bookList.add(new Book(100,"Tell me your dreams","Sidney Sheldon"));
        System.out.println(bookList);

        Iterator<String> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}
