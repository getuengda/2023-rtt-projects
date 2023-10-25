package org.perscholas.database;


import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class CreateAndUpdateExample {

	CustomerDAO customerDao = new CustomerDAO();
	
	
	public void insertCustomerExample() {
		Customer c = new Customer();
		
		// when creating a new database record do not set
		c.setContactFirstname("Eric");
		c.setContactLastname("Heiling");
		c.setAddressLine1("AddressLine1");
		c.setAddressLine2("AddressLine2");
		c.setCity("Denver");
		c.setState("Colorado");
		c.setPostalCode("82023");
		c.setCountry("USA");
		c.setCreditLimit(10000.00);
		c.setPhone("255-344-5566");
		
		System.out.println("customer id before save" + c.getId());
		customerDao.save(c);
		
		//after you have saved the entity, part of save process update the id
		System.out.println("customer id after save" + c.getId());
	}
	
	
	public void updateCustomerExample() {
		Customer c = customerDao.findById(344);
		
		if(c != null) {
		System.out.println("Customer Name : " + c.getCustomerName());
		
		c.setContactFirstname("Getas");
		c.setContactLastname("Mignorie");
		c.setCreditLimit(66655.55);
		
		// we can set the PK but the FK number needs to exist in employees table or
		// it will send error
		customerDao.save(c);
		} else {
			System.out.println("Customer does not exist");
		}
	}
	
	public void listQuery() {
		List<Customer> customers = customerDao.findByFirstName("Eric");
		List<Customer> customers1 = customerDao.findByFirstName("Ericcccccccc");
		List<Customer> customers2 = customerDao.findByFirstName(null);
		System.out.println("We found " + customers.size() + " records in the database");
		System.out.println("We found " + customers1.size() + " records in the database");
		System.out.println("We found " + customers2.size() + " records in the database");
	}
	
	// ----////// ----------
	
	
}
