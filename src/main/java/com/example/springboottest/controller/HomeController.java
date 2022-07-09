package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin page";
    }
}
