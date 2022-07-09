package com.example.springboottest.repository;

import com.example.springboottest.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDetailRepositoryImpl extends JpaRepository<UserDetails, Integer> {

}
