package com.example.springboottest.controller;

import com.example.springboottest.model.User;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
@RestController
@RequestMapping(value = "/users")
public class UserController {

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    private UserServiceImpl userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping(value = "/delete/{id}")
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteById(id);
    }


//    @GetMapping("/users")
//    public String listUsers(Model model){
//        model.addAttribute("users", userService.findAll());
//        return "userList";
////        return userService.findAll();
//    }


    public List<User> findAllUsers(Model model) {

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }


}
