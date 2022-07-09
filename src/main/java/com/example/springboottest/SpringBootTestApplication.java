package com.example.springboottest;

import com.example.springboottest.model.Role;
import com.example.springboottest.model.User;
import com.example.springboottest.service.impl.FlightServiceImpl;
import com.example.springboottest.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories
@EntityScan(basePackages = {"com.example.springboottest.model"})

public class SpringBootTestApplication {

    UserServiceImpl userService;

    public SpringBootTestApplication(UserServiceImpl userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    @PostConstruct
    public void run(){
        User arbri = new User();
        arbri.setId(1);
        arbri.setUsername("arbso");
        arbri.setPassword("546a7s8f9o");
        Set<Role> a = new HashSet<Role>();
        arbri.setRoles(a);
        userService.save(arbri);


    }


}
