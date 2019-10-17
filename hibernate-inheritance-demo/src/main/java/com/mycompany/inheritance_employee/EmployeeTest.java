package com.mycompany.inheritance_employee;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
					.addAnnotatedClass(ManagerEmployee.class)
					.addAnnotatedClass(SupervisorEmployee.class).buildSessionFactory();
			Session session = factory.openSession();
			Employee emp = new Employee("Shefali", "B S", 5, 20000);
			ManagerEmployee me = new ManagerEmployee("Sreejiha", "N", 10, 30000,
					"English",4);
			SupervisorEmployee se = new SupervisorEmployee("Swarna", "Acharya", 2, 15000, "Swimming");
		session.getTransaction().begin();
			session.save(emp);
			session.save(me);
			session.save(se);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}