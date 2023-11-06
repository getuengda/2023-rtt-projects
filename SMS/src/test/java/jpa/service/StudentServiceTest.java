package jpa.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import jpa.entitymodels.Course;

public class StudentServiceTest {
	private StudentService studentService = new StudentService();

	@Test
	void validateStudentTest() {
		String email = "stud102@getu.net";
		String password = "1002";

		boolean isValid = studentService.validateStudent(email, password);
		
		Assertions.assertEquals(isValid, email, password);
	}

	@Test
	void getStudentCoursesTest() {
		String email = "stud102@getu.net";
		List<Course> courses = studentService.getStudentCourses(email);

		Assertions.assertEquals(email, courses.isEmpty());
	}
	

}
