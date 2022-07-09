package com.example.springboottest.service;

import com.example.springboottest.model.UserDetails;

import java.util.List;

public interface Service<ENTITY, ID> {

    ENTITY save(ENTITY entity);
    void delete(ID id);
    void deleteById(ID id);
    ENTITY findById(ID id);
    List<ENTITY> findAll();

}