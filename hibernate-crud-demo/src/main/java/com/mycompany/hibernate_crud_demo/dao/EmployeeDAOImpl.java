package com.mycompany.hibernate_crud_demo.dao;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import javax.persistence.Query;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;

import com.mycompany.hibernate_crud_demo.factory.MyHibernateFactory;
import com.mycompany.hibernate_crud_demo.model.Employee;
import com.mycompany.hibernate_crud_demo.shared.SharedEmployee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Scanner scanner=new Scanner(in);
	private SessionFactory sessionFactory = null;
	private Session session = null;
	private String firstName;
	private String lastName;
	private String email;

	public EmployeeDAOImpl() {
		super();

		sessionFactory = MyHibernateFactory.getMySession();
	}

	@Override
	public void createEmployee(SharedEmployee sEmployee) {
		ModelMapper mapper = new ModelMapper();
		Employee employee = mapper.map(sEmployee, Employee.class);
		UUID uUid = UUID.randomUUID();
		employee.setGeneratedId(uUid.toString());
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();

	}

	@Override
	public List<SharedEmployee> getAllEmployee() {
		
		ModelMapper mapper = new ModelMapper();
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("from Employee");
		session.getTransaction().commit();
		@SuppressWarnings("unchecked")
		List<Employee> list1 = query.getResultList();
		List<SharedEmployee> sList = new ArrayList<SharedEmployee>();
		for (Employee e : list1) {
			SharedEmployee se = mapper.map(e, SharedEmployee.class);
			sList.add(se);
		}

		return sList;
	}

	@Override
	public SharedEmployee findById(int id) {
		
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Employee employee = session.get(Employee.class, new Integer(id));
		session.getTransaction().commit();
		SharedEmployee sEmployee = null;
		if (employee != null) {
			ModelMapper mapper = new ModelMapper();
			sEmployee = mapper.map(employee, SharedEmployee.class);
			return sEmployee;
		} else {
			return null;
		}

	}

	@Override
	public void findByCustomId(String customId) {
		

		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("from Employee e where e.generatedId=:cId").setParameter("cId", customId);
		@SuppressWarnings("unchecked")
		List<Employee> l = query.getResultList();

		session.getTransaction().commit();
		ModelMapper mapper = new ModelMapper();
		List<SharedEmployee> sList = new ArrayList<SharedEmployee>();
		for (Employee e : l) {
			SharedEmployee se = mapper.map(e, SharedEmployee.class);
			sList.add(se);
		}

		if (!sList.isEmpty()) {
			for (SharedEmployee se : sList) {
				System.out.println(se);
			}
		} else {
			System.out.println("no such custom id found.");
		}

	}

	@Override
	public void deleteEmployee(int id) {
		
		
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		Employee e=session.get(Employee.class, id);
		if(e!=null)
		{
			session.delete(e);
			System.out.println("deleted sucessfully..");
			session.getTransaction().commit();
		}
		
		else
		{
			System.out.println("no such record found.");
		}
		
		
	
	}

	
	/*public void updateEmployee(int id) {

		
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		
		
		Employee e=session.get(Employee.class, id);
		Query query = session
				.createQuery("update employee set firstName= :firstName, lastName= :lastName, email= :email where id= :id");
		query.setParameter("firstName", "Amit Raj");
		query.setParameter("lastName", "Amit Raj");
		query.setParameter("email", "Amit Raj");
		
		int result = query.executeUpdate();
		if(e!=null)
		{
			session.update(e);
			System.out.println("Updated sucessfully..");
			session.getTransaction().commit();
		}
		
		else
		{
			System.out.println("No such record found!");
		}
		
	}*/

}
