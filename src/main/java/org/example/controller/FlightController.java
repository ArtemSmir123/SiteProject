package org.example.controller;


import org.example.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/news")
    public String flightList(Model model) {
        model.addAttribute("allFlights", flightService.allFlights());
        return "news";
    }
}
