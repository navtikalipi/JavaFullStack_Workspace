
package com.example.service;

import com.example.model.Musician;
import com.example.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicianService {

    @Autowired
    MusicianRepository mr;

    public void addMusician(Musician musician) {
        mr.save(musician);
    }

    public List<Musician> listMusicians() {
        return mr.findAll();
    }

    public Optional<Musician> findOneMusician(int id) {
        return mr.findById(id);
    }

    public void deleteMusician(int id) {
        mr.deleteById(id);
    }
}
