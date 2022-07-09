package com.example.springboottest.repository;


import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface Repository<ENTITY, ID> {

    String save(ENTITY entity);
    void delete(ENTITY entity);
    ENTITY findById(ID id);
    List<ENTITY> findAll();

}