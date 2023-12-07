package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.id = :id")
    public Employee findEmployeeById(Integer id);

    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName")
    List<Employee> findByFirstName(String firstName);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE :firstName or e.lastName LIKE :lastName")
    List<Employee> findByLikeFirstNameOrLastName(String firstName, String lastName);
}
