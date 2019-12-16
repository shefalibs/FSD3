package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Employee> getEmployeeByID(int theID) {
		
		return employeeRepository.findById(theID);
	}

}
