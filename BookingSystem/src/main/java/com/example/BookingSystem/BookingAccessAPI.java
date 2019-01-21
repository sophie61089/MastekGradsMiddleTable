package com.example.BookingSystem;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/booking/")
public class BookingAccessAPI {
	
	BookingRepository repository;

	public BookingRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(BookingRepository repository) {
		this.repository = repository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Booking> listBookings(){
		return getRepository().findAll();
		
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Booking addBooking(@BeanParam Booking newBooking) {
		getRepository().save(newBooking);
		return newBooking;
		
	}

	
		
}
