package com.example.BookingSystem.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="GROUP_Train")
@XmlRootElement
public class Train {

	int trainNo;
	@FormParam("origin")
	String origin;
	@FormParam("destination")
	String destination;
	@FormParam("total_carriage_number")
	int totalCarriageNo;
	@FormParam("driver")
	String driver;
	@FormParam("provider")
	String provider;
	@FormParam("price")
	int price;
	
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", origin=" + origin + ", destination=" + destination
				+ ", totalCarriageNo=" + totalCarriageNo + ", driver=" + driver + ", provider=" + provider + ", price="
				+ price + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalCarriageNo() {
		return totalCarriageNo;
	}
	public void setTotalCarriageNo(int totalCarriageNo) {
		this.totalCarriageNo = totalCarriageNo;
	}
	public String getDriver() {
		return driver;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
}
