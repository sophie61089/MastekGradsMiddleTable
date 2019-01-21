package com.example.BookingSystem;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/trains/")
public class TrainAccessAPI {
 
	TrainJPARepository repository;

	public TrainJPARepository getRepository() {
		return repository;
	}

	public void setRepository(TrainJPARepository repository) {
		this.repository = repository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})//JSON will be default format when fetching data, if not JSON will give XML
	public Iterable<Train> listTrains(){
		return getRepository().findAll();
	}
	
}
