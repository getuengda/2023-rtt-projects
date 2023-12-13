package org.perscholas.springboot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.perscholas.springboot.service.EmployeeService;
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
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDao;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/find")
    public ModelAndView find(@RequestParam(required = false) Integer id){
        ModelAndView response = new ModelAndView("employee/find");
        log.debug("In the employee find controller method id: " + id);

        if(id != null){
            Employee employee = employeeDao.findById(id);
            response.addObject("id:", id);

            if(employee != null){
                response.addObject("employee", employee);
            }else {
                response.addObject("error", "No employee found with ID " + id);
            }
        }
        return response;
    }

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");
        log.info("In create employee with no args");
        return response;
    }


    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployeeSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            log.info("###### In create employee submit #######");
            ModelAndView response = new ModelAndView("employee/create");

            for(ObjectError error : bindingResult.getAllErrors()){
                log.info("error: " + error.getArguments());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);

            return response;
        }

        ModelAndView response = new ModelAndView("employee/create");

        employeeService.CreateEmployee(form);

        return response;
    }

    @GetMapping("/employee/edit/{employeeId}")
    public ModelAndView editEmployee(@PathVariable Integer employeeId){
        ModelAndView response = new ModelAndView("employee/create");

        Employee employee = employeeDao.findEmployeeById(employeeId);

        CreateEmployeeFormBean form = new CreateEmployeeFormBean();

        if(employee != null){
            form.setId(employee.getId());
            form.setFirstName(employee.getFirstName());
            form.setLastName(employee.getLastName());
            form.setDepartmentName(employee.getDepartmentName());
        }else{
            log.warn("Employee with id " + employeeId + " was not found");
            response.setViewName("redirect:/error/404");
            return response;
        }
        response.addObject("form", form);
        return response;
    }

    @GetMapping("/employee/detail")
    public ModelAndView employeeDetail(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("employee/detail");
        log.debug("In the employee detail controller method id: " + id);

        // Fetch single employee from the database by id
        Employee employee = employeeDao.findById(id);

        if (employee != null) {
            response.addObject("employee", employee);
        } else {
            log.warn("Employee with id " + id + " not found");
            response.setViewName("redirect:/error/404");
            return response;
        }

        return response;
    }

    @GetMapping("/employee/search")
    public ModelAndView search(@RequestParam(required = false) String firstName,
                               @RequestParam(required = false) String lastName){
        ModelAndView response = new ModelAndView("employee/search");

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
                log.debug("employee: id= " + employee.getId() + "first name = " + employee.getFirstName());
                log.debug("employee: id= " + employee.getId() + "last name = " + employee.getLastName());
            }
        }
        return response;
    }
}
