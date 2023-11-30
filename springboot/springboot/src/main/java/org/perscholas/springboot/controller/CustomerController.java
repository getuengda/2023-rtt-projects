package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Slf4j
@Controller
public class CustomerController {

    // add a label to the existing form input for first name
    // add a 2nd form input for last name
    // change the controller to accept the new form input for last name as well as first name
    // change the query to search by first name OR last name
    // change the query to use like for both first name and last name
    // make both search fields populate the user input if it was given

    @Autowired
    private CustomerDAO customerDao;
// Option One using @RequestParam(required = false)
//    @GetMapping("/customer/create")
//    public ModelAndView createCustomer(@RequestParam(required = false) String firstName,
//                                       @RequestParam(required = false) String lastName,
//                                       @RequestParam(required = false) String phone,
//                                       @RequestParam(required = false) String city) {
//        ModelAndView response = new ModelAndView("customer/create");
//
//        System.out.println("firstName: " + firstName);
//        System.out.println("lastName: " + lastName);
//        System.out.println("phone: " + phone);
//        System.out.println("city: " + city);
//        return response;
//    }

    // Option Two: using formBean
    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        //log.debug("In create customer with no args");
        log.info("In create customer with no args");
        log.debug("In create customer with no args");
        return response;
}

    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView("/customer/create");

        System.out.println("firstName: " + form.getFirstName());
        System.out.println("lastName: " + form.getLastName());
        System.out.println("phone: " + form.getPhone());
        System.out.println("city: " + form.getCity());

        Customer customer = new Customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());

        customerDao.save(customer);

        //log.debug("In create customer with incoming args");
        log.info("In create customer with incoming args");

        return response;
    }

//    @GetMapping("/customer/search")
//    public ModelAndView search(@RequestParam(required = false) String search) {
//        ModelAndView response = new ModelAndView("/customer/search");
//        log.debug("In the customer search controller method : search parameter = " + search);
//
//        if(search != null){
//            List<Customer> customers = customerDao.findByFirstName(search);
//            response.addObject("customerVar", customers);
//            response.addObject("search", search);
//
//            for(Customer customer : customers) {
//                log.debug("customer : id= " + customer.getId() + " last name = " + customer.getLastName());
//            }
//        }
//        return response;
//    }

//    @GetMapping("/customer/search")
//    public ModelAndView search(@RequestParam(required = false) String search,
//                               @RequestParam(required = false) String lastName) {
//        ModelAndView response = new ModelAndView("/customer/search");
//
//        log.debug("In the customer search controller method firstName: " + search);
//        log.debug("In the customer search controller method lastName: " + lastName);
//
//        if (search != null || lastName != null) {
//            List<Customer> customers = customerDao.findByFirstNameOrLastName(search, lastName);
//            response.addObject("customerVar", customers);
//            response.addObject("search", search);
//            response.addObject("lastName", lastName);
//
//
//            for (Customer customer : customers) {
//                log.debug("customer: id= " + customer.getId() + "first name = " + customer.getFirstName());
//                log.debug("customer: id= " + customer.getId() + "last name = " + customer.getLastName());
//            }
//        }
//
//        return response;
//    }

    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName) {
        ModelAndView response = new ModelAndView("/customer/search");

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

}
