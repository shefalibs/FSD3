package com.example.demo.reporitory;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
