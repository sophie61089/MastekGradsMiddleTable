package com.example.BookingSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROUP_HOTEL")
public class Hotel {
	
	int hotelId;
	String hotelName;
	String hotelLocation;
	double nightlyCost;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelLocation() {
		return hotelLocation;
	}
	
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	
	public double getNightlyCost() {
		return nightlyCost;
	}
	
	public void setNightlyCost(double nightlyCost) {
		this.nightlyCost = nightlyCost;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", nightlyCost=" + nightlyCost + "]";
	}
}
