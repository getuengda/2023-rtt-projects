package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		CourseService courseService = new CourseService();
		StudentService studentService = new StudentService();

		System.out.println("Welcome to SMS!");
		System.out.println("Select options: ");
		System.out.println("1. Student Login");
		System.out.println("2. Quit");

		String choice = sin.nextLine();

		while (!choice.equals("2")) {

			if (choice.equals("1")) {
				System.out.println("Please Enter your Email: ");
				String email = sin.nextLine();
				System.out.println("Please Enter your Password: ");
				String password = sin.nextLine();
				
				// Student Validation
				if (!studentService.validateStudent(email, password)) {
					System.out.println("Invalid student credentials!");
					System.exit(1);
				} else {
					System.out.println("My Clases are: ");
					List<Course> studentCourses = studentService.getStudentCourses(email);
					viewCourses(studentCourses);
					System.out.println("To Register or Logout select 1 or 2: ");
					System.out.println("1. Register to Course");
					System.out.println("2. Logout");
					String select = sin.nextLine();

					if (select.equals("1")) {
						System.out.println("Available Courses are: ");
						List<Course> allCourses = courseService.getAllCourses();
						viewCourses(allCourses);

						System.out.println("Which Course? ");
						int courseID = sin.nextInt();
						sin.nextLine();

						if (courseID != 0) {
							Course selectedCourse = courseService.getCourseById(courseID);
							
							 if (studentCourses.stream().anyMatch(course -> course.getcId() == courseID)) {
				                    System.out.println("Course ID " + courseID + " is already registered.");
				                }else {
								// Register the student for the selected Course
								studentService.registerStudentToCourse(email, selectedCourse.getcId());
								
								// View Courses by Email
								studentCourses = studentService.getStudentCourses(email);
								System.out.println("These are My Classes: ");
								viewCourses(studentCourses);
							}
						} else {
							System.out.println("Invalid course ID");
						}
					} else if (select.equals("2")) {
						System.out.println("You have been signed out");
						System.exit(1);
					} 
				}
			} else {
				System.out.println("Please, enter 1 or 2");
			}
			System.out.println("Welcome Back to SMS!");
			System.out.println("Select options: ");
			System.out.println("1. Student Login");
			System.out.println("2. Quit");
			choice = sin.nextLine();
		}
		System.out.println("Exiting program. Goodbye");
		sin.close();
	}

	private static void viewCourses(List<Course> courses) {
		//System.out.println("COURSE ID COURSE NAME INSTRUCTOR NAME");
		System.out.printf("%-15s%-27s%-17s%n", "COURSE ID", "COURSE NAME", "INSTRUCTOR NAME");
		for (int i = 0; i < courses.size(); i++) {
			Course course = courses.get(i);
			System.out.printf("%-12d%-30s%-20s%n", course.getcId(), course.getcName(), course.getcInstructorName());

		}
	}
}
