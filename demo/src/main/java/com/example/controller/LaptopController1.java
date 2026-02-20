package com.example.controller;
import com.example.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptop1")
public class LaptopController1 {

    List<Laptop> list = new ArrayList<>();

    public LaptopController1() {
        list.add(new Laptop(0, "Dell", 16, 512, "i7"));
        list.add(new Laptop(1, "HP", 8, 256, "i5"));
        list.add(new Laptop(2, "Lenovo", 32, 1024, "Ryzen 7"));
    }

    // =========================
    // GET ALL LAPTOPS
    // =========================
    @GetMapping("/list")
    public List<Laptop> getAllLaptops() {
        return list;
    }

    // =========================
    // GET ONE LAPTOP BY INDEX
    // =========================
    @GetMapping("/findOne/{index}")
    public Laptop getOneLaptop(@PathVariable int index) {
        return list.get(index);
    }

    // =========================
    // ADD NEW LAPTOP
    // =========================
    @PostMapping("/add")
    public void addLaptop(@RequestBody Laptop laptop) {
        list.add(laptop);
    }

    // =========================
    // UPDATE LAPTOP
    // =========================
    @PutMapping("/update/{index}")
    public void updateLaptop(@PathVariable int index,
                             @RequestBody Laptop laptop) {
        list.set(index, laptop);
    }

    // =========================
    // DELETE LAPTOP
    // =========================
    @DeleteMapping("/delete/{index}")
    public void deleteLaptop(@PathVariable int index) {
        list.remove(index);
    }

}



//Use JPA-Classes will be table, attributes will be columns and objects will be rows