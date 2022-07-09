package com.example.springboottest.service.impl;

import com.example.springboottest.model.Role;
import com.example.springboottest.model.User;
import com.example.springboottest.model.UserDetails;
import com.example.springboottest.repository.RoleRepository;
import com.example.springboottest.repository.UserRepositoryImpl;
import com.example.springboottest.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;

import static com.example.springboottest.misc.PassMD5.cryptWithMD5;

@org.springframework.stereotype.Service
public class UserServiceImpl implements Service<User, Integer> {

    private final RoleRepository roleRepository;
    private final UserRepositoryImpl userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepositoryImpl userRepository, RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public User save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByUsername(String username){
        return userRepository.findByusername(username);
    }


    @Override
    public void deleteById(Integer integer) {
        userRepository.deleteById(integer);
    }

}
