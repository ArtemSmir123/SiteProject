package org.example.entity;

import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue
    @Column(name = "id_city")
    Long id_city;
    String name_city;

    @Transient
    @OneToMany(mappedBy = "departure_city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
    Set<Flight> flight;

    @Transient
    @OneToMany(mappedBy = "arrival_city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
    Set<Flight> flight1;


    public Set<Flight> getFlight() {
        return flight;
    }
    public Long getId_city() {
        return id_city;
    }
    public Set<Flight> getFlight1() {
        return flight1;
    }
    public String getName_city() {
        return name_city;
    }

    public void setFlight(Set<Flight> flight) {
        this.flight = flight;
    }
    public void setFlight1(Set<Flight> flight1) {
        this.flight1 = flight1;
    }
    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }
    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

}
