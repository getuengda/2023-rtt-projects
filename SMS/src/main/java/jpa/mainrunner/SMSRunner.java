package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;
import java.util.InputMismatchException;

public class SMSRunner {
    private static final String LOGIN_OPTION = "1";
    private static final String QUIT_OPTION = "2";
    CourseService courseService = new CourseService();
    StudentService studentService = new StudentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();

        System.out.println("Welcome to SMS!");
        String choice;

        do {
            System.out.println("Select options: ");
            System.out.println("1. Student Login");
            System.out.println("2. Quit");

            choice = scanner.nextLine();

            switch (choice) {
                case LOGIN_OPTION:
                    handleStudentLogin(scanner, studentService, courseService);
                    break;
                case QUIT_OPTION:
                    System.out.println("Exiting program. Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice. Please, enter 1 or 2");
                    break;
            }

        } while (!choice.equals(QUIT_OPTION));

        scanner.close();
    }

    private static void handleStudentLogin(Scanner scanner, StudentService studentService, CourseService courseService) {
        System.out.println("Please Enter your Email: ");
        String email = scanner.nextLine();
        System.out.println("Please Enter your Password: ");
        String password = scanner.nextLine();

        Student selectedStudent = studentService.getStudentByEmail(email);

        if (selectedStudent == null || !studentService.validateStudent(email, password)) {
            System.out.println("Invalid student credentials!");
        } else {
            List<Course> studentCourses = studentService.getStudentCourses(email);
            System.out.println("My Classes are: ");
            viewCourses(studentCourses);

            System.out.println("To Register or Logout select 1 or 2: ");
            System.out.println("1. Register to Course");
            System.out.println("2. Logout");

            try {
                int select = scanner.nextInt();
                scanner.nextLine(); 

                if (select == 1) {
                    System.out.println("Available Courses are: ");
                    List<Course> allCourses = courseService.getAllCourses();
                    viewCourses(allCourses);

                    System.out.println("Enter the Course ID to Register: ");
                    int courseID = scanner.nextInt();
                    scanner.nextLine();

                    registerStudentForCourse(courseID, studentCourses, courseService, email);
                } else if (select == 2) {
                    System.out.println("You have been signed out");
                } else {
                    System.out.println("Invalid choice. Please, enter 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please, enter a number.");
                scanner.nextLine(); 
            }
        }
    }

    private static void registerStudentForCourse(int courseID, List<Course> studentCourses,
                                                 CourseService courseService, String email) {
        if (courseID != 0) {
            Course selectedCourse = courseService.getCourseById(courseID);

            if (studentCourses.stream().anyMatch(course -> course.getcId() == courseID)) {
                System.out.println("Course ID " + courseID + " is already registered.");
            } else {
            	StudentService studentService = new StudentService();
                studentService.registerStudentToCourse(email, selectedCourse.getcId());
                studentCourses = studentService.getStudentCourses(email);
                System.out.println("Successfully registered for the course.");
                System.out.println("These are My Classes: ");
                viewCourses(studentCourses);
            }
        } else {
            System.out.println("Invalid course ID");
        }
    }

    private static void viewCourses(List<Course> courses) {
        System.out.printf("%-15s%-27s%-17s%n", "COURSE ID", "COURSE NAME", "INSTRUCTOR NAME");
        for (Course course : courses) {
            System.out.printf("%-12d%-30s%-20s%n", course.getcId(), course.getcName(), course.getcInstructorName());
        }
    }
}


//public class SMSRunner {
//	
//	public static void main(String[] args) {
//		Scanner sin = new Scanner(System.in);
//		CourseService courseService = new CourseService();
//		StudentService studentService = new StudentService();
//
//		System.out.println("Welcome to SMS!");
//		System.out.println("Select options: ");
//		System.out.println("1. Student Login");
//		System.out.println("2. Quit");
//
//		String choice = sin.nextLine();
//
//		while (!choice.equals("2")) {
//
//			if (choice.equals("1")) {
//				System.out.println("Please Enter your Email: ");
//				String email = sin.nextLine();
//				System.out.println("Please Enter your Password: ");
//				String password = sin.nextLine();
//				
//				// Student Validation
//				Student selectedStudent = studentService.getStudentByEmail(email);
//				System.out.println(selectedStudent);
//			
//				if (!studentService.validateStudent(email, password)) {
//					System.out.println("Invalid student credentials!");
//					choice = sin.nextLine();
//					System.exit(1);
//				// If the Student is valid will go to next level to register for a course or logout
//				} else {
//					// If the credentials are valid, the student is logged in and
//					// all the classes the Student is registered will be displayed
//					
//					List<Course> studentCourses = studentService.getStudentCourses(email);
//					System.out.println("My Clases are: ");
//					viewCourses(studentCourses);
//					
//					// Displays and prompt the student to select one of the following 
//					// two additional numeric (1 or 2) options that are available:
//					System.out.println("To Register or Logout select 1 or 2: ");
//					System.out.println("1. Register to Course");
//					System.out.println("2. Logout");
//					String select = sin.nextLine();
//					
//					// So will list existing all courses for the student to select one
//					if (select.equals("1")) {
//						System.out.println("Available Courses are: ");
//						List<Course> allCourses = courseService.getAllCourses();
//						viewCourses(allCourses);
//					// Select course by Course ID to Add/ Register
//						System.out.println("Which Course? ");
//						int courseID = sin.nextInt();
//						sin.nextLine();
//
//						if (courseID != 0) {
//							// Here will cross check if the selected course is already registered before or not
//							Course selectedCourse = courseService.getCourseById(courseID);
//							
//							 if (studentCourses.stream().anyMatch(course -> course.getcId() == courseID)) {
//				                    System.out.println("Course ID " + courseID + " is already registered.");
//				                }else {
//								// Register the student for the selected Course
//								studentService.registerStudentToCourse(email, selectedCourse.getcId());
//								
//								// View Courses by Email
//								studentCourses = studentService.getStudentCourses(email);
//								System.out.println("Successfully registered for the course.");
//								System.out.println("These are My Classes: ");
//								viewCourses(studentCourses);
//							}
//						} else {
//							System.out.println("Invalid course ID");
//						}
//					} else if (select.equals("2")) {
//						System.out.println("You have been signed out");
//						System.exit(1);
//					} 
//				}
//			} else {
//				System.out.println("Please, enter 1 or 2");
//			}
//			System.out.println("Welcome Back to SMS!");
//			System.out.println("Select options: ");
//			System.out.println("1. Student Login");
//			System.out.println("2. Quit");
//			choice = sin.nextLine();
//		}
//		System.out.println("Exiting program. Goodbye");
//		sin.close();
//	}
//
//	private static void viewCourses(List<Course> courses) {
//		System.out.printf("%-15s%-27s%-17s%n", "COURSE ID", "COURSE NAME", "INSTRUCTOR NAME");
//		for (int i = 0; i < courses.size(); i++) {
//			Course course = courses.get(i);
//			System.out.printf("%-12d%-30s%-20s%n", course.getcId(), course.getcName(), course.getcInstructorName());
//
//		}
//	}
//}
