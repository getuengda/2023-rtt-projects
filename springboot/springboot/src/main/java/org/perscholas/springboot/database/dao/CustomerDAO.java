package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerDAO<select, SELECT> extends JpaRepository<Customer, Long> {

    public Customer findById(int id);

    @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName")
    List<Customer> findByFirstName(String firstName);

//    @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName or c.lastName = :lastName")
//    List<Customer> findByFirstNameOrLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("SELECT c FROM Customer c WHERE c.firstName LIKE :firstName or c.lastName LIKE :lastName")
    List<Customer> findByLikeFirstNameOrLastName(String firstName, String lastName);


}
