package com.example.BookingSystem;

public class Hotel {
	
	int hotelId;
	String hotelName;
	String hotelLocation;
	double nightlyCost;
	
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
