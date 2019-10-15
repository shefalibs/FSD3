package org.customer.app;

import java.util.List;
import java.util.Scanner;

import org.customer.app.factory.CustomerFactory;
import org.customer.app.factory.CustomerFactoryImpl;
import org.customer.app.model.Customer;
public class App 
{
    private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args )
    {
        try {
        	CustomerFactory impl=new CustomerFactoryImpl();
        	Customer customer=null;
        	int choice;
        	do {
        		
            	System.out.println("1.Create Customer.");
            	System.out.println("2.Dispay all Customers");
            	System.out.println("3.Find Customer by ID");
            	System.out.println("4.Update Customer.");
            	System.out.println("5.Remove Customer.");
            	System.out.println("0.Exit");
            	System.out.println("Enter your choice:");
            	choice=scanner.nextInt();
        		switch(choice) {
        		case 1:
        			System.out.print("ID: "); int id=scanner.nextInt();
	       			 System.out.print("NAME: "); String name=scanner.next();
	       			 System.out.print("EMAIL: "); String email=scanner.next();
	       			 
	       			 CustomerFactory impl1=new CustomerFactoryImpl(); Customer
	       			 customer1=impl1.createCustomer(id, name, email);
	       			 System.out.println(customer1.toString());
	        		break;
        		
        		case 2: List<Customer> list=impl.getAllCustomer();
		            	for(Customer c:list)
		            	{
		            		System.out.println(c);
		            	}
		            	break;
		            	
        		case 3: System.out.println("Enter id to search:");
		            	int id1=scanner.nextInt();
		            	impl.findById(id1);
		            	break;
            	
        		case 4: System.out.println("Enter id to update:");
        				id=scanner.nextInt();
        				impl.updateCustomer(id);
        				break;
        			
        		case 5: System.out.println("Enter id to delete:");
						id=scanner.nextInt();
						impl.deleteCustomer(id);
						break;
        		
        		case 0: System.out.println("Bye!");
        				System.exit(0);
        				
        		default: 
        				System.out.println("Invalid choice");
        				break;
        		}
        		}while(choice!=0);	
        	
        	
        	
			
        	
           	
        	/*
        	System.out.println("Enter name to search:");
        	String name=scanner.next();
        	impl.findByName(name);*/
        	}
        	catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        	
    }
}