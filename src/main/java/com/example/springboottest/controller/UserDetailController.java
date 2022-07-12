//package com.example.springboottest.controller;
//
//import com.example.springboottest.model.Flight;
//import com.example.springboottest.model.UserDetails;
//import com.example.springboottest.service.impl.FlightServiceImpl;
//import com.example.springboottest.service.impl.UserDetailsServiceImpl;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/userDetails")
//public class UserDetailController {
//
//    public UserDetailController(UserDetailsServiceImpl userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    private UserDetailsServiceImpl userDetailsService;
//
//    @PostMapping("/add")
//    public UserDetails addUserDetail(@RequestBody UserDetails userDetails) {
//        userDetailsService.save(userDetails);
//        return userDetails;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteUserDetail(@PathVariable Integer id) {
//        userDetailsService.deleteById(id);
//    }
//
//    @GetMapping("/userDetails")
//    public List<UserDetails> findAllUserDetails() {
//        return userDetailsService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public UserDetails findUserDetailsById(@PathVariable Integer id) {
//        return userDetailsService.findById(id);
//    }
//
//
//}
