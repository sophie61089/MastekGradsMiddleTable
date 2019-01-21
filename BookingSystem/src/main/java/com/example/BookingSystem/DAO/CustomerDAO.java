package com.example.BookingSystem.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.BookingSystem.DataAccessObject;
import com.example.BookingSystem.Entities.Customer;


public class CustomerDAO implements DataAccessObject<Customer>{
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Customer add(Customer newEntity) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(newEntity);
		session.getTransaction().commit();
		session.close();
		return newEntity;
	}

	@Override
	public List<Customer> find(int key) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		
		// generic fetch for Object.
		Customer e = (Customer) session.get(Customer.class, key);
		session.getTransaction().commit();
		session.close();
		
		
		List<Customer> employee = new ArrayList<>();
		employee.add(e);
		return employee;
		
	}

}
