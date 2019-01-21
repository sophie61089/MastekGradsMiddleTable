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

import com.example.BookingSystem.Entities.Train;
import com.example.BookingSystem.JPA.TrainJPARepository;

@Component
@Path("/trains/")
public class TrainAccessAPI {
 
	TrainJPARepository repository;

	public TrainJPARepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(TrainJPARepository repository) {
		this.repository = repository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})//JSON will be default format when fetching data, if not JSON will give XML
	public Iterable<Train> listTrains(){
		return getRepository().findAll();
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Train addTrain(@BeanParam Train newTrain) {
		getRepository().save(newTrain);
		return newTrain;
	}
}
