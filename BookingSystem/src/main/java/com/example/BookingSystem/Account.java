package com.example.BookingSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="GROUP_Account")
@XmlRootElement
public class Account {
	
	int accountId;
	
	@FormParam("type")
	String accountType;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAccountId() {
		return accountId ;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + "]";
	}

	
	
}
