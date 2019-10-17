package com.mycompany.inheritance_account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("International CD")
public class CurrentAccount extends Account {
	
	private int interest;

	

	public CurrentAccount(int accountNumber, String fullName, int balance, int interest) {
		super(accountNumber,fullName,balance);
		this.interest=interest;
	}
}