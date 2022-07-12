package com.example.springboottest.security;

import com.example.springboottest.model.User;
import com.example.springboottest.repository.UserRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class MyUserDetails implements UserDetailsService {
    private final UserRepositoryImpl userRepository;

    public MyUserDetails(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(s);
        if (null == user) {
            throw new UsernameNotFoundException(s);
        }
        return new CustomUserDetails(user);
    }
//
//  private final UserRepositoryImpl userRepository;
//
//  @Override
//  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    final User user = userRepository.findByUsername(username);
//
//    if (user == null) {
//      throw new UsernameNotFoundException("User '" + username + "' not found");
//    }
//
//    return org.springframework.security.core.userdetails.User//
//        .withUsername(username)//
//        .password(user.getPassword())//
//        .authorities(user.getRoles())//
//        .accountExpired(false)//
//        .accountLocked(false)//
//        .credentialsExpired(false)//
//        .disabled(false)//
//        .build();
//  }

}
