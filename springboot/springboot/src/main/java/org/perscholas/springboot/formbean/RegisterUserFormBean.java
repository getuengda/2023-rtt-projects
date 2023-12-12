package org.perscholas.springboot.formbean;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class RegisterUserFormBean {
    @Email(message = "Email must be a valid email address")
    @NotEmpty(message = "Password cannot be empty")
    private String email;


    private String password;

    @NotEmpty(message = "Confirm Password cannot be empty")
    private String confirmPassword;


}
