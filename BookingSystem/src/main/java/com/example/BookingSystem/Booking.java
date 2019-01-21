package com.example.BookingSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity 
@Table(name="Group_Booking")
@XmlRootElement
public class Booking {
	
	
	
	Integer bookingId;
	@FormParam("time")
	String time;
	@FormParam("date")
	String date;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
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
