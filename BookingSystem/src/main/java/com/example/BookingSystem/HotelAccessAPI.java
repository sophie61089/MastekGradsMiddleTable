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
@Path("/hotels/")
public class HotelAccessAPI {
	
	HotelJPARepository hotelRepository;
	
	public HotelJPARepository getHotelRepo() {
		return hotelRepository;
	}

	@Autowired
	public void setHotelRepo(HotelJPARepository hotelRepo) {
		this.hotelRepository = hotelRepository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Hotel> listHotels(){
		return getHotelRepo().findAll();
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Hotel addTraining(@BeanParam Hotel newHotel) {
		getHotelRepo().save(newHotel);
		return newHotel;
	}

}
