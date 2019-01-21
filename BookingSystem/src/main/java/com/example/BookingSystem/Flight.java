package com.example.BookingSystem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GROUP_Flights")

public class Flight {
	
	int flightNo;
	String flightDate;
	String flightOrigin;
	String flightDestination;
	String airline;
	double flightPrice;
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
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
		return "Flight [flightNo=" + flightNo + ", flightDate=" + flightDate + ", flightOrigin=" + flightOrigin
				+ ", flightDestination=" + flightDestination + ", airline=" + airline + ", flightPrice=" + flightPrice
				+ "]";
	}
	
	
	 

}
