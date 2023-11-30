package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    public Employee findById(int id);

    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName")
    List<Employee> findByFirstName(String firstName);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE :firstName or e.lastName LIKE :lastName")
    List<Employee> findByLikeFirstNameOrLastName(String firstName, String lastName);
}
