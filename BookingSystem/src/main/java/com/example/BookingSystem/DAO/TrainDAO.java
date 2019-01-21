package com.example.BookingSystem.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.BookingSystem.DataAccessObject;
import com.example.BookingSystem.Entities.Train;

public class TrainDAO implements DataAccessObject<Train> {
	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Train add(Train newEntity) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(newEntity);
		session.getTransaction().commit();
		session.close();
		return newEntity;
	}

	@Override
	public List<Train> find(int key) {
		Session session=getSessionFactory().openSession();
		session.beginTransaction();
		Train tra = session.get(Train.class, key);
		session.getTransaction().commit();
		
		session.close();
		
		List<Train>list=new ArrayList<>();
		list.add(tra);
		return list;
	}
	
//	@Override
//	public Account remove(Account e) {
//		Session session = getSessionFactory().openSession();
//		session.beginTransaction();
//		session.delete(e); //DELETE
//		session.getTransaction().commit();
//		session.close();
//		return e;
//	}
//	
//	@Override
//	public Account update(Account e) {
//		Session session = getSessionFactory().openSession();
//		session.beginTransaction();
//		session.merge(e); //UPDATE
//		session.getTransaction().commit();
//		session.close();
//		return e;
//	}	
	
	

	
	
}
