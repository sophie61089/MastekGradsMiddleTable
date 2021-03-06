package com.example.BookingSystem.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="GROUP_Flights")
@XmlRootElement // enable java object to XML data

public class Flight {
	
	int flightNo;
	@FormParam("departureDate")
	String departureDate;
	@FormParam("arrivalDate")
	String arrivalDate;
	@FormParam("flightOrigin")
	String flightOrigin;
	@FormParam("flightDestination")
	String flightDestination;
	@FormParam("airline")
	String airline;
	@FormParam("flightPrice")
	double flightPrice;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getFlightOrigin() {
		return flightOrigin;
	}
	public void setFlightOrigin(String flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {  
		this.flightPrice = flightPrice;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", flightOrigin=" + flightOrigin + ", flightDestination=" + flightDestination + ", airline=" + airline
				+ ", flightPrice=" + flightPrice + "]";
	}
	
	
}

