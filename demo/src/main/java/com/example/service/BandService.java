package com.example.service;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {

    @Autowired
    BandRepository br;

    public void addBand(Band band) {
        br.save(band);
    }

    public List<Band> listBands() {
        return br.findAll();
    }

    public Optional<Band> findOneBand(int id) {
        return br.findById(id);
    }

    public void deleteBand(int id) {
        br.deleteById(id);
    }
}
