package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

	// add a method to search by first name and last name
	public List<Employee> findByFirstNameContainsAndLastNameContainsAndEmailContainsAllIgnoreCase(
									String theFirstName, String theLastName, String theEmail);
	
}
