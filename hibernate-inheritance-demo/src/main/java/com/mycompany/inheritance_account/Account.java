package com.mycompany.inheritance_account;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Account_type")
@DiscriminatorValue("Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int accountNumber;
	private String fullName;
	private int balance;

	
	public Account(int accountNumber, String fullName, int balance) {
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.balance = balance;
	}
}