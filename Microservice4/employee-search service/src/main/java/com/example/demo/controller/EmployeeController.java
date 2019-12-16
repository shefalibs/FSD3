package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeSearchService;
import com.example.model.Employee;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeSearchService employeeSearchService;

	
	public EmployeeController(EmployeeSearchService employeeSearchService) {
		super();
		this.employeeSearchService = employeeSearchService;
	}

	@RequestMapping("/employees")
	public List<Employee> getaAllEmployees(){
		return employeeSearchService.getAllEmployees();
		
	}
	

}

