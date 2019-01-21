package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;

import com.example.BookingSystem.Entities.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer>{

}
