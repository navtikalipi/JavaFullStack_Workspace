package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Use JPA-Classes will be table, attributes will be columns and objects will be rows

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //Laptop table will be created
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; // annotate @Id(jakarta persistence) on top of the attribute to make it a primary key

    private String brand;
    private int ram;
    private int storage;
    private String processor;

}