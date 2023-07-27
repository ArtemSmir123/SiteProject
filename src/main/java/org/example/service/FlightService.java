package org.example.service;

import org.example.entity.Flight;
import org.example.entity.User;
import org.example.repository.FlightRepository;
//import org.example.repository.PlaneRepository;
import org.example.repository.RoleRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class FlightService {
    @PersistenceContext
    private EntityManager em;

//    @Autowired
//    PlaneRepository planeRepository;
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> allFlights() {
        return flightRepository.findAll();
    }
}
