package com.example.BookingSystem;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="Group_Booking")
public class Booking {
	
	Integer bookingId;
	String time;
	String date;
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {//123
		this.bookingId = bookingId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", time=" + time + ", date=" + date + "]";
	}
	
	
	

}
