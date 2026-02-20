
package com.example.controller;

import com.example.model.Musician;
import com.example.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musician")
public class MusicianController {

    @Autowired
    MusicianService ms;

    @PostMapping("/add")
    public void add(@RequestBody Musician musician) {
        ms.addMusician(musician);
    }

    @GetMapping("/list")
    public List<Musician> list() {
        return ms.listMusicians();
    }

    @GetMapping("/findOne/{id}")
    public Optional<Musician> findOne(@PathVariable int id) {
        return ms.findOneMusician(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        ms.deleteMusician(id);
    }


}
