package com.test.demo.com.test.repository;

import com.test.demo.com.test.model.Dinosaurio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinosaurioRepository extends JpaRepository<Dinosaurio, Long> {
}
