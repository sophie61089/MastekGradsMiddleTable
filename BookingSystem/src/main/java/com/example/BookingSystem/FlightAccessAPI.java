package com.example.BookingSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightAccessAPI {
	
	FlightJPARepository repository;

	public FlightJPARepository getRepository() {
		return repository;
	}
@Autowired
	public void setRepository(FlightJPARepository repository) {
		this.repository = repository;
	}
	
	public Iterable<Flight> listFlights(){
		return getRepository().findAll();
	}
	
	public Flight addFlight(Flight newFlight) {
		getRepository().save(newFlight);
		return newFlight;
	}

}
