package com.example.springboottest.service.impl;


import com.example.springboottest.model.Flight;
import com.example.springboottest.repository.FlightRepositoryImpl;
import com.example.springboottest.service.Service;

import java.util.List;
@org.springframework.stereotype.Service
public class FlightServiceImpl implements Service<Flight, Integer> {

    private FlightRepositoryImpl flightRepository;

    public FlightServiceImpl(FlightRepositoryImpl flightRepository) {
        this.flightRepository = flightRepository;
    }


    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);

    }
    @Override
    public void deleteById(Integer integer){
        flightRepository.deleteById(integer);
    }

    @Override
    public void delete(Integer id) {
        flightRepository.deleteById(id);
    }

    @Override
    public Flight findById(Integer integer) {
        return flightRepository.findById(integer).orElse(null);
    }

    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();

    }
}
