package com.test.demo.com.test.service;

import com.test.demo.com.test.model.Dinosaurio;
import com.test.demo.com.test.repository.DinosaurioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DinosaurioService {
    private static final Logger logger = LoggerFactory.getLogger(DinosaurioService.class);


    @Autowired
    private DinosaurioRepository dinosaurioRepository;

    public List<Dinosaurio> getAllDinosaurs() {
        return dinosaurioRepository.findAll();
    }

    public Optional<Dinosaurio> getDinosaur(Long id) {
        return dinosaurioRepository.findById(id);
    }


    public Dinosaurio createDinosaur(Dinosaurio dinosaur) {
        Dinosaurio d = new Dinosaurio();
        d.setName(dinosaur.getName());
        d.setContinent(dinosaur.getContinent());
        d.setPeriod(dinosaur.getPeriod());
        return dinosaurioRepository.save(d);
    }

    public Dinosaurio updateDinosaur(Long id, Dinosaurio dinosaur) {
        return dinosaurioRepository.save(dinosaur);
    }

    public void deleteDinosaur(Long id) {
        dinosaurioRepository.deleteById(id);
    }
}
