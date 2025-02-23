package com.test.demo.com.test.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Version;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Dinosaurio implements Serializable {
    private static final long serialVersionUID = -7636394097858726922L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    private String species;
    private String continent;

    private Timestamp discoveryDate;
    private Timestamp extinctionDate;
    /*@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;*/

    public enum Status {
        ALIVE,
        ENDANGERED,
        EXTINCT
    }

    /*public Dinosaurio (){
        this.setStatus(Status.ALIVE);
    }*/

    @PrePersist
    @PreUpdate
    public void validate() {
        if (discoveryDate.before(extinctionDate)) {
            throw new IllegalArgumentException("El valor de discoveryDate no puede ser mayor o igual al valor de\n" +
                    "extinctionDate.");
        }
       /* if (status.equals(Status.EXTINCT)) {
            throw new IllegalArgumentException("No se puede modificar un dinosaurio EXTINCT.");
        }
        if (this.status == null) {
            this.status = Status.ALIVE; // Valor por defecto
        }*/
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Timestamp getDiscoveryDate() {
        return discoveryDate;
    }

    public void setDiscoveryDate(Timestamp discoveryDate) {
        this.discoveryDate = discoveryDate;
    }

    public Timestamp getExtinctionDate() {
        return extinctionDate;
    }

    public void setExtinctionDate(Timestamp extinctionDate) {
        this.extinctionDate = extinctionDate;
    }

   /* public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
       this.status = status;
    }
    */

}
