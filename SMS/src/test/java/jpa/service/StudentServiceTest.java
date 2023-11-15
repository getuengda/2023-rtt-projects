package jpa.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;

public class StudentServiceTest {

	private StudentService studentService = new StudentService();

	@BeforeEach
	public void setUp() {
		studentService = new StudentService();
	}

	@Test
	public void validateStudentTest() {
		String email = "stud102@getu.net";
		String password = "1002"; // email entered is correct

		boolean isValid = studentService.validateStudent(email, password);

		assertTrue(isValid);
	}

	@Test
	public void validateStudentNotMatchTest() {

		String email = "stud102@getu.net";
		String password = "0205";

		boolean actual = studentService.validateStudent(email, password);

		assertFalse(actual);
	}

	@Test
	public void getStudentCoursesByEmailTest() {
		String email = "stud102@getu.net";
		List<Course> courses = studentService.getStudentCourses(email);

		Assertions.assertNotEquals(email, courses.isEmpty());
	}

}
