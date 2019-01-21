package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Flight;

@Component
	public interface FlightJPARepository extends CrudRepository<Flight, Integer>{

}


