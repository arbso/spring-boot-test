package com.example.springboottest.repository;

import com.example.springboottest.model.User;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public interface UserRepositoryImpl extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    boolean existsByUsername(String username);
}
