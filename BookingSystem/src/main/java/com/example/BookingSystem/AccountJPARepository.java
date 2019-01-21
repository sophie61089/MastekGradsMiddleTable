package com.example.BookingSystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountJPARepository extends CrudRepository<Account, Integer>{

}
