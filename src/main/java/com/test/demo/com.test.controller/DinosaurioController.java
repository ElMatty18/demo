package com.test.demo.com.test.controller;

import com.test.demo.com.test.model.Dinosaurio;
import com.test.demo.com.test.service.DinosaurioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dinosaurios")
public class DinosaurioController {
    private static final Logger logger = LoggerFactory.getLogger(DinosaurioController.class);


    @Autowired
    private DinosaurioService dinosaurioService;

    @GetMapping
    public List<Dinosaurio> getDinosaurs() {
        return dinosaurioService.getAllDinosaurs();
    }

    @GetMapping("/{id}")
    public Optional<Dinosaurio> getDinosaur(@PathVariable Long id) {
        return dinosaurioService.getDinosaur(id);
    }

    @PostMapping
    public Dinosaurio createDinosaur(@RequestBody Dinosaurio dinosaur) {
        return dinosaurioService.createDinosaur(dinosaur);
    }

    @PutMapping("/{id}")
    public Dinosaurio updateDinosaur(@PathVariable Long id, @RequestBody Dinosaurio dinosaur) {
        logger.info("BBBB");


        return dinosaurioService.updateDinosaur(id, dinosaur);
    }

    @DeleteMapping("/{id}")
    public void deleteDinosaur(@PathVariable Long id) {
        dinosaurioService.deleteDinosaur(id);
    }
}
