package com.example.demo.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;
import com.example.demo.entity.*;

@RefreshScope

@RestController
@RequestMapping("/api")
public class EmployeeSearchController {

	@Autowired

	EmployeeService employeeService;

	@RequestMapping("/employees")
	public Collection<Employee> findAll() {
		return employeeService.getAllEmployee();

	}
	
	@GetMapping("/employees/{theId}")
	public Optional<Employee> getEmployee(@PathVariable int theId) {
		
		return employeeService.getEmployeeByID(theId);
		
	}


}