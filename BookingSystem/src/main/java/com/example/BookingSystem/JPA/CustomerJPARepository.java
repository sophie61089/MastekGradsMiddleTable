package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Customer;

@Component
public interface CustomerJPARepository extends CrudRepository<Customer, Integer>{

}
