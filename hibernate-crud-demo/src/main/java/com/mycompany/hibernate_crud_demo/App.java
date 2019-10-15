package com.mycompany.hibernate_crud_demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo.dao.EmployeeDAO;
import com.mycompany.hibernate_crud_demo.dao.EmployeeDAOImpl;
import com.mycompany.hibernate_crud_demo.model.Employee;
import com.mycompany.hibernate_crud_demo.shared.SharedEmployee;
import static java.lang.System.in;

public class App 
{
	private static Scanner scanner=new Scanner(in);
    public static void main( String[] args )
    {
    	EmployeeDAO dao=new EmployeeDAOImpl();
        try {
        	int choice=0;
        	do {
        		System.out.println("1.Create employee");
        		System.out.println("2.Display all available employees");
        		System.out.println("3.Find employee by ID");
        		System.out.println("4.Find employee by custom ID");
        		System.out.println("5.Remove by ID");
        		//System.out.println("6.Update employee");
        		System.out.println("0.Exit");
        		System.out.print("Enter your choice: ");
        		choice=scanner.nextInt();
        		switch (choice) {
				case 1:
					
					System.out.print("First Name: ");
					String fName=scanner.next();
					System.out.print("Last Name: ");
					String lName=scanner.next();
					System.out.print("Email: ");
					String email=scanner.next();
					  dao.createEmployee(new SharedEmployee(fName,lName,email));
					  System.out.println("Successfully inserted");
					 		
					break;
				case 2:
					List<SharedEmployee> se=dao.getAllEmployee();
		        	for(SharedEmployee see:se)
		        	{
		        		System.out.println(see);
		        	}
		        	
		        	break;
				case 3:
					System.out.print("Enter employee ID: ");
					int id=scanner.nextInt();
					SharedEmployee sEmployee=dao.findById(id);
					if(sEmployee==null)
					{
						System.out.println("No such record found!");
					}
					else {
						System.out.println(sEmployee);
					}

					break;
				case 4:
					System.out.println("Custon ID: ");
					String cid=scanner.next();
					dao.findByCustomId(cid);
					break;
				case 5:
					System.out.println("Enter employee ID: ");
					id=scanner.nextInt();
					dao.deleteEmployee(id);
					break;
				/*case 6:
					System.out.println("Enter employee ID:");
					id=scanner.nextInt();
					dao.updateEmployee(id);
					break;*/
				default:
					break;
				}
				
			} while (choice!=0);
			
        	
        	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
}

