package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	
	// This method reads the student table in your database 
	//and returns the data as a List<Student>
	List<Student> getAllStudents();
	
	// This method takes a Student’s email as a String and parses the student list 
	// for a Student with that email and returns a Student Object.
    Student getStudentByEmail(String email);
    
    // Validate student credentials based on email and password
    boolean validateStudent(String email, String password);
    
    // Register a student for a course
	// return true if registration is successful, false otherwise 
 	// i.e. the student is not already registered for the course
 	// and If the student is already registered return false
	// The method should check if the student is already registered 
 	// for the course. 
 	// If not, it should register the student for the course
    void registerStudentToCourse(String email, Integer courseId);
    
    // should return a list of Course objects that the student with 
    //the provided email is registered for.
    List<Course> getStudentCourses(String email);	

}
