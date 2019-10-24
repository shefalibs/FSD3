package comm.example.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import comm.example.model.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(first_name,last_name,email) values (?,?,?)",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		jdbcTemplate.update("update customer set first_name = ?, last_name = ? ,email = ? where id = 15",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
	}

	@Override
	public void deleteCustomer(int id) {
		jdbcTemplate.update("delete from customer where id = 5");
		
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select first_name,last_name,email from customer", new CustomerMapper());
	}


}