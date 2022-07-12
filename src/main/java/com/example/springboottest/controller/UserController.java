package com.example.springboottest.controller;

import com.example.springboottest.model.User;
import com.example.springboottest.service.impl.UserServiceImpl;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Api(tags = "users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("/signin")
    public String login(//
                         @RequestParam String username, //
                         @RequestParam String password) {
        return userService.signin(username, password);
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping(value = "/delete/{id}")
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteById(id);
    }


    public List<User> findAllUsers(Model model) {

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }


}
