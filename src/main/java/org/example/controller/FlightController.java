package org.example.controller;


import org.example.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/news")
    public String flightList(Model model) {
        model.addAttribute("allFlights", flightService.allFlights());
        model.addAttribute("allCities", flightService.allCities());
        System.out.println(flightService.allFlights().get(0).getArrival_city().getName_city());
        System.out.println(flightService.allFlights().get(0).getArrival_city_code());
        return "news";
    }
}
