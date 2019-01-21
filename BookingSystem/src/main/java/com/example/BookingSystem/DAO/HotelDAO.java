package com.example.BookingSystem.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.BookingSystem.DataAccessObject;
import com.example.BookingSystem.Entities.Hotel;

public class HotelDAO implements DataAccessObject<Hotel>{
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Hotel add(Hotel newEntity) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(newEntity); //Insert the object into DB
		session.getTransaction().commit();
		session.close();
		return newEntity;
	}

	@Override
	public List<Hotel> find(int key) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Hotel hotel = session.get(Hotel.class, key); //Select
		session.getTransaction().commit();
		session.close();
		List<Hotel> list = new ArrayList<>();
		list.add(hotel);
		return list;
	}

}
