package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    public User findByEmailIgnoreCase(String email);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    public User findUserById(Integer id);

}
