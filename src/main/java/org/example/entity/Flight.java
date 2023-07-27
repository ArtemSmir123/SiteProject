package org.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    Integer id_flight;
    String id_user;
    Timestamp creation_date;
    Timestamp departure_date;
    Timestamp arrival_date;
    String departure_city;
    String arrival_city;
    Long id_plane;
//    @OneToOne(fetch = FetchType.EAGER)
//    private Plane plane;
    public Flight() {

    }

    public Integer getId_flight() {
        return id_flight;
    }
    public String getId_user() {
        return id_user;
    }
    public String getDeparture_city() {
        return departure_city;
    }
    public String getArrival_city() {
        return arrival_city;
    }
    public Long getId_plane() {
        return id_plane;
    }
    public Timestamp getArrival_date() {
        return arrival_date;
    }
    public Timestamp getCreation_date() {
        return creation_date;
    }
    public Timestamp getDeparture_date() {
        return departure_date;
    }

    public void setId_plane(Long id_plane) {
        this.id_plane = id_plane;
    }
    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }
    public void setArrival_date(Timestamp arrival_date) {
        this.arrival_date = arrival_date;
    }
    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
    }
    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }
    public void setDeparture_date(Timestamp departure_date) {
        this.departure_date = departure_date;
    }
    public void setId_flight(Integer id_flight) {
        this.id_flight = id_flight;
    }
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
}
