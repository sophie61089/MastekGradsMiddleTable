package com.example.BookingSystem.JPA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Account;

@Component
public interface AccountJPARepository extends CrudRepository<Account, Integer>{

}
