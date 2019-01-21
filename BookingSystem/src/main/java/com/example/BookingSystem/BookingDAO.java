package com.example.BookingSystem;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.BookingSystem.DataAccessObject;


public class BookingDAO  implements DataAccessObject<Booking>{
	
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Booking add(Booking newEntity) {
		Session session= getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(newEntity); // INSERT the object in DB
		session.getTransaction().commit();
		session.close();
		return newEntity;
	}

	@Override
	public List<Booking> find(int key) {
		Session session= getSessionFactory().openSession();
		session.beginTransaction();
		Booking bk = session.get(Booking.class, key); // Select
		session.getTransaction().commit();
		
		session.close();
		
		List<Booking> list = new ArrayList<>();
		list.add(bk);
		return list;
	}

}
