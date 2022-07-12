package com.example.springboottest.controller;

import com.example.springboottest.model.Booking;
import com.example.springboottest.model.Flight;
import com.example.springboottest.service.impl.BookingServivceImpl;
import com.example.springboottest.service.impl.FlightServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    public BookingController(BookingServivceImpl bookingServivce) {
        this.bookingServivce = bookingServivce;
    }

    private BookingServivceImpl bookingServivce;

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        bookingServivce.save(booking);
        return booking;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBooking(@PathVariable Integer id) {
        bookingServivce.deleteById(id);
    }

    @GetMapping("/bookings")
    public List<Booking> findAllBookings() {
        return bookingServivce.findAll();
    }

    @GetMapping("/{id}")
    public Booking fightBookingById(@PathVariable Integer id) {
        return bookingServivce.findById(id);
    }


}
