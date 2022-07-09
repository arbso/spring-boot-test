package com.example.springboottest.controller.viewController;

import com.example.springboottest.service.impl.FlightServiceImpl;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class flightViewController {

    public flightViewController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }

    private FlightServiceImpl flightService;

    @GetMapping("/flights")
    public String listFlights(Model model){
        model.addAttribute("flights", flightService.findAll());
        return "flightList";
    }
}
