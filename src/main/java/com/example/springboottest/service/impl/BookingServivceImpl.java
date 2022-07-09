package com.example.springboottest.service.impl;

import com.example.springboottest.model.Booking;
import com.example.springboottest.model.UserDetails;
import com.example.springboottest.repository.BookingRepositoryImpl;
import com.example.springboottest.service.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class BookingServivceImpl implements Service<Booking, Integer> {

    public BookingServivceImpl(BookingRepositoryImpl repository){

    }

    private BookingRepositoryImpl bookingRepository;

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);

    }

    @Override
    public void delete(Integer id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public void deleteById(Integer integer){
        bookingRepository.deleteById(integer);
    }
    @Override
    public Booking findById(Integer integer) {
        return bookingRepository.findById(integer).orElse(null);

    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();

    }
}
