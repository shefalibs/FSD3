package com.mycompany.inheritance_employee;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Supervisor Employee")
public class SupervisorEmployee extends Employee {
	private String skills;

	

	public SupervisorEmployee(String firstName, String lastName, int experience, double salary, String skills) {
		super(firstName,lastName,experience,salary);
		this.skills = skills;;
	}
}