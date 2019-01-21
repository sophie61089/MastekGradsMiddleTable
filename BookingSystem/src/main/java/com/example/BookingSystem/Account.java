package com.example.BookingSystem;

public class Account {
	
	int accountId;
	String accountType;
	
	
	public int getAccountId() {
		return accountId;
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
