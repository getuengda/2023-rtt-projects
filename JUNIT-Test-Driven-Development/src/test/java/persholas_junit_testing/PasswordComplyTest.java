package persholas_junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import perscholas_junit_testing.PasswordComply;

public class PasswordComplyTest {
	@Test
	void testDoesPasswordComply() {
		boolean expectedResult = true;
		PasswordComply password = new PasswordComply("abcd1234");
		boolean actualResult = password.doesPasswordComply();
		assertEquals(expectedResult,actualResult, "Password conditions failed!");
		System.out.println("Password conditions success!");
	}
	
	@Test
	void testDoesPasswordExist() {
		PasswordComply password = new PasswordComply("abcd1234");
		assertThrows(java.sql.SQLException.class,() -> 
		password.doesNotAlreayExist(), "SQL Exception was thrown.");
	}
	
	@Test
	void testEmptyPassword() {
		PasswordComply password = new PasswordComply("Abcd1234!");
		assertThrows(NullPointerException.class,() -> 
		password.doesNotAlreayExist(), "Null Exception was thrown but received SQL Exception.");
	}

}
