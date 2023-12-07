package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public void CreateEmployee(CreateEmployeeFormBean form){

        log.info("id: " + form.getId());
        log.info("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("departmentName: " + form.getDepartmentName());

        Employee employee = employeeDAO.findEmployeeById(form.getId());

        if(employee == null) {
            employee = new Employee();
        }

        employee.setId(form.getId());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());

        employeeDAO.save(employee);
        log.info("In create employee with incoming args");
    }
}
