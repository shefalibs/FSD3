package com.mycompany.inheritance_employee;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Manager Employee")
public class ManagerEmployee extends Employee {
	private String languages;
	private int region;

	

	public ManagerEmployee(String firstName, String lastName, int experience, double salary, String language, int region) {
		super(firstName,lastName,experience,salary);
		languages = language;
		this.region = region;
	}
}