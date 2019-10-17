package com.mycompany.inheritance_employee;

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
@DiscriminatorColumn(name = "Employee_type")
@DiscriminatorValue("Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private int experience;
	private double salary;

	
	public Employee(String firstName, String lastName, int experience, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.experience = experience;
		this.salary = salary;
	}
}