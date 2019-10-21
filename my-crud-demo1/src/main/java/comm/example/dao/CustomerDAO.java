package comm.example.dao;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getAllCustomer();
	public void createCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public Customer getCustomerById(int id);
}
