package com.example.springboottest;

import com.example.springboottest.model.Role;
import com.example.springboottest.model.User;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories
@EntityScan(basePackages = {"com.example.springboottest.model"})
public class SpringBootTestApplication {

    final UserServiceImpl userService;

    public SpringBootTestApplication(UserServiceImpl userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    @PostConstruct
    public void run(){
//
//        User admin = new User();
//        admin.setUsername("auth");
//        admin.setPassword("auth");
//
//        admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));
//
//        userService.save(admin);
    }


}
