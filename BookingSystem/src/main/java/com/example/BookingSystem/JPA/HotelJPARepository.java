package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Hotel;

@Component
public interface HotelJPARepository extends CrudRepository<Hotel, Integer> {

}
