package com.example.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample { //duplicates are removed
    public static void main(String[] args) {
        Set<String> set1=new HashSet();//unsorted, more write operations than read
        set1.add("Upasana");
        set1.add("David");
        set1.add("Virat");
        set1.add("Upasana");
        set1.add("Dhoni");
        set1.add("Sharma");
        System.out.println(set1);

        Set<String> set2=new TreeSet();//sorted, more read operations than write
        set2.add("Upasana");
        set2.add("David");
        set2.add("Virat");
        set2.add("Upasana");
        set2.add("Dhoni");
        set2.add("Sharma");
        System.out.println(set2);


    }
}