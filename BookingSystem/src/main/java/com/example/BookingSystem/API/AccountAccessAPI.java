package com.example.BookingSystem.API;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.BookingSystem.Entities.Account;
import com.example.BookingSystem.JPA.AccountJPARepository;

@Component
@Path("/account/")
public class AccountAccessAPI {
	
	AccountJPARepository repository ;

	public AccountJPARepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(AccountJPARepository repository) {
		this.repository = repository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Account> listAccounts(){
		return getRepository().findAll();
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Account addAccount(@BeanParam Account newAccount) {
		getRepository().save(newAccount);
		return newAccount ;
	}

}
