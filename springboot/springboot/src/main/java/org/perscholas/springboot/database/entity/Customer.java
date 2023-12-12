package org.perscholas.springboot.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "First Name is required.")
    @Length(max = 45,message =  "First name must be less than 45 characters.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "First Name must contain only letters")
    @Column(name = "firstname")
    private String firstName;

    @NotEmpty(message = "Last name is required.")
    @Length(max = 45,message =  "Last name must be less than 45 characters.")
    @Pattern(regexp = "[a-zA-Z]+" , message = "First Name must contain only letters")
    @Column(name = "lastname")
    private String lastName;

    @Length(max = 45,message =  "Phone must be less than 45 characters.")
    @Column(name = "phone")
    private String phone;

    @NotEmpty(message = "city is required.")
    @Column(name = "city")
    private String city;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "user_id")
    private Integer userId;
}
