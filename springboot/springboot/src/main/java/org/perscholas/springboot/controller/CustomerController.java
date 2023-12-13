package org.perscholas.springboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.dao.UserDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.User;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.security.AuthenticatedUserService;
import org.perscholas.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Slf4j
@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;

    @Autowired
    private CustomerService customerService;

    @Autowired
    AuthenticatedUserService authenticatedUserService;

    @Autowired
    UserDAO userDao;

    // add a label to the existing form input for first name
    // add a 2nd form input for last name
    // change the controller to accept the new form input for last name as well as first name
    // change the query to search by first name OR last name
    // change the query to use like for both first name and last name
    // make both search fields populate the user input if it was given


    // --- component scan phase 1
    // 1. Find all classes with @Component, @Service, @Repository, @Controller, @RestController and instantiate them and add them to the spring context
    // 2. Find all classes with @Configuration and instantiate them and add them to the Spring context
    // 3. Runs all the methods in the Configuration classes and anything marked with @Bean will be added them to the Spring context
    // 4. Find all classes with @ControllerAdvice and add them to the Spring context

    // -- component scan phase 2
    // 1. Inject all of the dependencies using @Autowired

    // -- component scan phase 3
    // 1. Run all of the methods marked with @PostConstruct


    //    @GetMapping("/customer/delete/{customerId}")
    //    public ModelAndView deleteCustomer(@PathVariable int customerId) {
    //        ModelAndView response = new ModelAndView("customer/search");
    //
    //        Customer customer = customerDao.findById(customerId);
    //
    //        if ( customer != null ) {
    //            customerDao.delete(customer);
    //        } else {
    //            log.warn("Customer with id " + customerId + " was not found") ;
    //        }
    //
    //        return response;
    //    }

    //TODO // 1) on the customer search results I want you to add another column that says Detail
//TODO  2) This will be an <a href> tag that has the word Detail as the text very similar to how edit works
//TODO  3) Create a new controller method for customer detail.  This controller method will take a request parm that is the customer id
//TODO  4) in the customer DAO createa  findByid method that returns a single customer and uses the request param to find the customer
//TODO  4) Create a new jsp file for customer detail that displays the customer id, first name, last name, phone, city, and image url
//TODO     none of these fields are editable.
//TODO  5) on the customer detail page creaet a button that says "Edit" and when you click it it will take you to the edit page for that customer

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        log.info("In create customer with no args");
        log.debug("In create customer with no args");
        return response;
    }

    // the action attribute on the form tag is set to /customer/createSubmit
    // so this method will be called when the user clicks the submit button
    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }

        log.info("######################### In create customer submit - no error found #########################");

        Customer c = customerService.createCustomer(form);

        // the view name can either be a jsp file name or a redirect to another controller method
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");

        return response;
    }

    @GetMapping("/customer/edit/{customerId}")
    public ModelAndView editCustomer(@PathVariable int customerId, @RequestParam(required = false) String success) {
        ModelAndView response = new ModelAndView("customer/create");

        Customer customer = customerDao.findById(customerId);

        if (!StringUtils.isEmpty(success)) {
            response.addObject("success", success);
        }

        CreateCustomerFormBean form = new CreateCustomerFormBean();

        if (customer != null) {
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setPhone(customer.getPhone());
            form.setImageUrl(customer.getImageUrl());
        } else {
            log.warn("Customer with id " + customerId + " was not found");
        }

        response.addObject("form", form);

        return response;
    }


    @GetMapping("/customer/detail")
    public ModelAndView customerDetail(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("customer/detail");
        log.debug("In the customer detail controller method id: " + id);

        // Fetch single customer by id
        Customer customer = customerDao.findById(id);

        if (customer != null) {
            response.addObject("customer", customer);
        } else {
            log.warn("Customer with id " + id + " not found");
            response.setViewName("redirect:/error/404");
            return response;
        }

        return response;
    }

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName) {
        ModelAndView response = new ModelAndView("customer/search");

        log.debug("In the customer search controller method firstName: " + firstName);
        log.debug("In the customer search controller method lastName: " + lastName);

        if (!StringUtils.isEmpty(firstName) || !StringUtils.isEmpty(lastName)) {
            response.addObject("firstName", firstName);
            response.addObject("lastName", lastName);

            if (!StringUtils.isEmpty(firstName)) {
                firstName = "%" + firstName + "%";
            }

            if (!StringUtils.isEmpty(lastName)) {
                lastName = "%" + lastName + "%";
            }

            // we only want to do this code if the user has entered any character(s) either a first name or a last name

            List<Customer> customers = customerDao.findByLikeFirstNameOrLastName(firstName, lastName);
            response.addObject("customerVar", customers);

            for (Customer customer : customers) {
                log.debug("customer: id= " + customer.getId() + "first name = " + customer.getFirstName());
                log.debug("customer: id= " + customer.getId() + "last name = " + customer.getLastName());
            }
        }

        return response;
    }

    @GetMapping("/customer/myCustomers")
    public void myCustomers() {
        log.info("######################### In my customers #########################");

        // 1) Use the authenticated user service to find the logged-in user
        User user = authenticatedUserService.loadCurrentUser();

        // 2) Create a DAO method that will find by userId
        // 3) use the authenticated user id to find a list of all customers created by this user
        List<Customer> customers = customerDao.findByUserId(user.getId());

        // 4) loop over the customers created and log.debug the customer id and customer last name
        for ( Customer customer : customers ) {
            log.debug("customer: id = " + customer.getId() + " last name = " + customer.getLastName());
        }

    }

}
