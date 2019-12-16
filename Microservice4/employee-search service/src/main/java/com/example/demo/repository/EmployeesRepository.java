package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;


@Repository
public interface EmployeesRepository extends MongoRepository<Employee, String> {
	
	//public Posts findBy_id();
}
