package comm.example;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.dao.CustomerDAO;
import comm.example.dao.CustomerDAOImpl;
import comm.example.model.Customer;

public class Tester {

	public static void main(String[] args) {
		

		try {
			
			//to create new customer
			/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);
			customerDAO.createCustomer(new Customer("Rahul", "Dravid", "rahul@luv2code.com"));
			System.out.println("ok!");*/
			
			
			//to update existing customer
			/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);
			customerDAO.updateCustomer(new Customer("Shifali", "Alva", "samyuktha@luv2code.com"));
			System.out.println("ok!");*/
			
			//to delete customer 
			/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);
			customerDAO.deleteCustomer(5);
			System.out.println("ok!");*/
			
			//to retrieve the data
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);
			List<Customer> list=customerDAO.getAllCustomer(); 
			Iterator<Customer> i=list.iterator(); while(i.hasNext()) { Customer c=i.next();
			  System.out.println(c.getFirstName()+" , "+c.getLastName()+" , "+c.getEmail())
			  ; }
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}