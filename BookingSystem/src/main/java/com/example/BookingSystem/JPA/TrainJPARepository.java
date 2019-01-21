package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Train;

@Component
public interface TrainJPARepository extends CrudRepository<Train, Integer>{

	
}
