package com.example.BookingSystem;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AccountDAO implements DataAccessObject<Account>{
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Account add(Account newEntity) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(newEntity); //insert
		session.getTransaction().commit();
		session.close();
		return newEntity;
	}

	@Override
	public List<Account> find(int key) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Account acc = session.get(Account.class, key);
		session.getTransaction().commit();
		session.close();
		
		List<Account> list = new ArrayList<>();
		list.add(acc);
		return list;
	}
	
	

}
