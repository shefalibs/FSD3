package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeesRepository;
import com.example.model.Employee;
@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	
	@Autowired
	private EmployeesRepository employeesRepository;

	

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeesRepository.findAll();
	}

}
