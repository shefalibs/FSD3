package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired  
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {

		Query theQuery = entityManager.createQuery("from Employee", Employee.class);

		@SuppressWarnings("unchecked")
		List<Employee> employees = theQuery.getResultList();

		return employees;
	}

	

	@Override
	public void save(Employee theEmployee) {

		Employee dbEmployee = entityManager.merge(theEmployee);
		
		theEmployee.setEmployeeId(dbEmployee.getEmployeeId());
		
	}

	@Override
	public void deleteById(int theId) {

		Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");

		theQuery.setParameter("employeeId", theId);

		theQuery.executeUpdate();
	}

	
	@Override
	public Employee findById(int theId) {

		// get employee
		Employee theEmployee = entityManager.find(Employee.class, theId);

		// return employee
		return theEmployee;
	}
	
	@Override
	public Employee findByEmail(String theEmail) {
		Employee theEmployee = entityManager.find(Employee.class, theEmail);
		return theEmployee;
	}

}
