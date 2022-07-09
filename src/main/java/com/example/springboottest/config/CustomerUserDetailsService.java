//package com.example.springboottest.config;
//
//import com.example.springboottest.model.User;
//import com.example.springboottest.repository.UserRepositoryImpl;
//import com.example.springboottest.service.impl.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserServiceImpl userService;
//
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//
//        User user = userService.findByUsername(username);
//        if (user==null){
//            throw new UsernameNotFoundException("User not found");
//
//        }
//
//        return null;
//    }
//}
