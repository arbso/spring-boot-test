//package com.example.springboottest.service.impl;
//
//import com.example.springboottest.model.UserDetails;
//import com.example.springboottest.repository.UserDetailRepositoryImpl;
//import com.example.springboottest.service.Service;
//
//import java.util.List;
//@org.springframework.stereotype.Service
//public class UserDetailsServiceImpl implements Service<UserDetails, Integer> {
//
//    public UserDetailsServiceImpl(UserDetailRepositoryImpl repository){
//
//    }
//
//    private UserDetailRepositoryImpl userDetailsRepository;
//
//
//    @Override
//    public String save(UserDetails userDetails) {
//       userDetailsRepository.save(userDetails);
//       return null;
//    }
//
//    @Override
//    public void delete(Integer id) {
//        userDetailsRepository.deleteById(id);
//    }
//
//    @Override
//    public UserDetails findById(Integer integer) {
//        return userDetailsRepository.findById(integer).orElse(null);
//
//    }
//
//    @Override
//    public List<UserDetails> findAll() {
//        return userDetailsRepository.findAll();
//    }
//
//    @Override
//    public void deleteById(Integer integer){
//        userDetailsRepository.deleteById(integer);
//    }
//
//}
