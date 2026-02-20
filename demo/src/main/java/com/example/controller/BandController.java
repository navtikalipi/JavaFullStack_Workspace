package com.example.controller;

import com.example.model.Band;
import com.example.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/band")
public class BandController {

    @Autowired
    BandService bs;

    @PostMapping("/add")
    public void add(@RequestBody Band band) {
        bs.addBand(band);
    }

    @GetMapping("/list")
    public List<Band> list() {
        return bs.listBands();
    }

    @GetMapping("/findOne/{id}")
    public Optional<Band> findOne(@PathVariable int id) {
        return bs.findOneBand(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        bs.deleteBand(id);
    }
}

