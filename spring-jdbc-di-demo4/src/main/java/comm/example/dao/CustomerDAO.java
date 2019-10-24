package comm.example.dao;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	
	public void createCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public List<Customer> getAllCustomer();

}