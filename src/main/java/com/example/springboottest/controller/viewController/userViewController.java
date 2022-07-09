package com.example.springboottest.controller.viewController;

import com.example.springboottest.service.impl.FlightServiceImpl;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userViewController {

    public userViewController(UserServiceImpl userService) {
        this.userService = userService;

    }

    private UserServiceImpl userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "userList";
    }
}
