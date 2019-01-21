package com.example.BookingSystem.API;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Flight;
import com.example.BookingSystem.JPA.FlightJPARepository;

@Component
@Path("/flights/")
public class FlightAccessAPI {
	
	FlightJPARepository repository;

	public FlightJPARepository getRepository() {
		return repository;
	}
@Autowired
	public void setRepository(FlightJPARepository repository) {
		this.repository = repository;
	}
	
@Path("/list/")
@GET
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Flight> listFlights(){
		return getRepository().findAll();
	}
	
	@POST
	@Path("/book")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Flight addFlight(@BeanParam Flight newFlight) {
		getRepository().save(newFlight);
		return newFlight;
	}

}
