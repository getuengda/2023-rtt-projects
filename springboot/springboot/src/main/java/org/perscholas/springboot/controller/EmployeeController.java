package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDao;

    // Option One: using @RequestParam(required = false)
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

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");
        //log.debug("In create customer with no args");
        log.info("In create employee with no args");
        return response;
    }

    // Option Two: using formBean
    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("/employee/create");

        System.out.println("firstName: " + form.getFirstName());
        System.out.println("lastName: " + form.getLastName());
        System.out.println("departmentName: " + form.getDepartmentName());


        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());

        employeeDao.save(employee);

        //log.debug("In create customer with incoming args");
        log.info("In create employee with incoming args");

        return response;
    }

//    @GetMapping("/employee/search")
//    public ModelAndView search(@RequestParam(required = false) String search){
//        ModelAndView response = new ModelAndView("/employee/search");
//        log.debug("In the employee search controller method : search parameter = " + search);
//
//        if(search != null){
//            List<Employee> employees = employeeDao.findByFirstName(search);
//            response.addObject("employeeVar", employees);
//            response.addObject("search", search);
//
//            for(Employee employee : employees){
//                log.debug("employee : id= " + employee.getId() + " first name = " + employee.getFirstName());
//            }
//        }
//
//       return response;
//    }

    @GetMapping("/employee/search")
    public ModelAndView search(@RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName){
        ModelAndView response = new ModelAndView("/employee/search");

        log.debug("In the employee search controller method firstName: " + firstName);
        log.debug("In the employee search controller method lastName: " + lastName);

        if(!StringUtils.isEmpty(firstName) || !StringUtils.isEmpty(lastName)){
            response.addObject("firstName", firstName);
            response.addObject("lastName", lastName);

            if(!StringUtils.isEmpty(firstName)){
                firstName = "%" + firstName + "%";
                lastName = "%" + lastName + "%";
            }
            List<Employee> employees = employeeDao.findByLikeFirstNameOrLastName(firstName, lastName);
            response.addObject("employeeVar", employees);

            for(Employee employee : employees){
                log.debug("customer: id= " + employee.getId() + "first name = " + employee.getFirstName());
                log.debug("customer: id= " + employee.getId() + "last name = " + employee.getLastName());
            }
        }
        return response;
    }
}
