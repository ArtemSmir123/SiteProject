package org.example.entity;

import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planes")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planes")
    Integer id_planes;
    String model;
    String fulltitle;
    Integer numberofseats;

    @Transient
    @OneToMany(mappedBy = "plane", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Flight> flight;

    public Plane(){}

    public Integer getId_planes() {
        return id_planes;
    }
    public String getModel() {
        return model;
    }
    public String getFulltitle() {
        return fulltitle;
    }
    public Integer getNumberofseats() {
        return numberofseats;
    }
    public Set<Flight> getFlight() {
        return flight;
    }

    public void setId_planes(Integer id_planes) {
        this.id_planes = id_planes;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setFulltitle(String fulltitle) {
        this.fulltitle = fulltitle;
    }
    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }
    public void setFlight(Set<Flight> flight) {
        this.flight = flight;
    }
}

