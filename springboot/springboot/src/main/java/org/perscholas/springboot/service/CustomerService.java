package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDao;

    public Customer createCustomer( CreateCustomerFormBean form){

        log.info("id: " + form.getId());
        log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getPhone());
        log.info("city: " + form.getCity());

        Customer customer = customerDao.findById(form.getId());

        if(customer == null){
            customer = new Customer();
        }

        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());

       return (Customer) customerDao.save(customer);
    }
}
