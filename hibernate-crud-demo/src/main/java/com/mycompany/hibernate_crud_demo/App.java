 package com.mycompany.hibernate_crud_demo;

import java.util.List;
  

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo.dao.EmployeeDAO;
import com.mycompany.hibernate_crud_demo.dao.EmployeeDAOImpl;
import com.mycompany.hibernate_crud_demo.model.Employee;
import com.mycompany.hibernate_crud_demo.shared.SharedEmployee;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAO dao=new EmployeeDAOImpl();
        try {
        	List<SharedEmployee> se=dao.getAllEmployee();
        	for(SharedEmployee see:se)
        	{
        		System.out.println(see);
        	}
        	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

