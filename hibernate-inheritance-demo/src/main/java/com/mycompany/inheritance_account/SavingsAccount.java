package com.mycompany.inheritance_account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("International CD")
public class SavingsAccount extends Account {
	
	private int loanAmount;

	

	public SavingsAccount(int accountNumber, String fullName, int balance, int loanAmount) {
		super(accountNumber,fullName,balance);
		this.loanAmount=loanAmount;
	}
}