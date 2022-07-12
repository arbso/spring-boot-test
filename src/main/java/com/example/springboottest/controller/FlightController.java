package com.example.springboottest.controller;

import com.example.springboottest.model.Flight;
import com.example.springboottest.model.User;
import com.example.springboottest.service.impl.FlightServiceImpl;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {

    public FlightController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }

    private FlightServiceImpl flightService;

    @PostMapping("/add")
    public Flight addFlight(@RequestBody Flight flight) {
        flightService.save(flight);
        return flight;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Integer id) {
        flightService.deleteById(id);
    }


    public List<Flight> findAllFlights() {
        return flightService.findAll();
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Integer id) {
        return flightService.findById(id);
    }


}
