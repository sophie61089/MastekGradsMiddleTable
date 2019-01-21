package com.example.BookingSystem.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.BookingSystem.DataAccessObject;
import com.example.BookingSystem.Entities.Flight;

public class FlightDAO implements DataAccessObject<Flight> {
	
SessionFactory sessionfactory;




	public SessionFactory getSessionfactory() {
	return sessionfactory;
}

public void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}



	@Override
public String toString() {
	return "FlightDAO [sessionfactory=" + sessionfactory + "]";
}

	@Override
	public Flight add(Flight newEntity) { 
		Session session = getSessionfactory().openSession();
		session.beginTransaction();
		session.persist(newEntity); //Insert the object into DB
		session.getTransaction().commit();
		session.close();
		return newEntity; 
	}

	@Override
	public List<Flight> find(int key) {
		Session session = getSessionfactory().openSession();
		session.beginTransaction();
		Flight flight = session.get(Flight.class, key); //Select
		session.getTransaction().commit();
		session.close();
		List<Flight> list = new ArrayList<>();
		list.add(flight);
		return list;
	}

}
