package org.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_flight;
    private String id_user;
    private Timestamp creation_date;
    private Timestamp departure_date;
    private Timestamp arrival_date;

    @Column(name = "arrival_city_code", nullable = false, insertable = false, updatable = false)
    private Long arrival_city_code;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "arrival_city_code", referencedColumnName = "id_city")
    private City arrival_city;

    @Column(name = "departure_city_code", nullable = false, insertable = false, updatable = false)
    private Long departure_city_code;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "departure_city_code", referencedColumnName = "id_city")
    private City departure_city;


    @Column(name = "id_plane", nullable = false, insertable = false, updatable = false)
    private Integer id_plane;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plane", referencedColumnName = "id_planes")
    private Plane plane;


    public Flight() {

    }

    public Integer getId_flight() {
        return id_flight;
    }
    public String getId_user() {
        return id_user;
    }
    public Integer getId_plane() {
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
    public Plane getPlane() {
        return plane;
    }
    public Long getArrival_city_code() {
        return arrival_city_code;
    }
    public Long getDeparture_city_code() {
        return departure_city_code;
    }
    public City getArrival_city() {
        return arrival_city;
    }
    public City getDeparture_city() {
        return departure_city;
    }


    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    public void setId_plane(Integer id_plane) {
        this.id_plane = id_plane;
    }
    public void setArrival_date(Timestamp arrival_date) {
        this.arrival_date = arrival_date;
    }
    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
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
    public void setArrival_city_code(Long arrival_city_code) {
        this.arrival_city_code = arrival_city_code;
    }
    public void setDeparture_city_code(Long departure_city_code) {
        this.departure_city_code = departure_city_code;
    }
    public void setArrival_city(City arrival_city) {
        this.arrival_city = arrival_city;
    }
    public void setDeparture_city(City departure_city) {
        this.departure_city = departure_city;
    }

}
