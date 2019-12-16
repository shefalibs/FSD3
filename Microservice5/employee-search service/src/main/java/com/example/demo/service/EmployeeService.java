package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Optional<Employee> getEmployeeByID(int theID);
}
