package jpa.service;

import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public CourseService courseService = new CourseService();
	public CourseDAO courseDAO;

	@Override
	public List<Student> getAllStudents() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {

			String hql = "FROM Student";
			TypedQuery<Student> query = session.createQuery(hql, Student.class);
			
			List<Student> students = query.getResultList();
			return students;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Student getStudentByEmail(String email) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {

			String hql = "FROM Student WHERE sEmail = :email";
			TypedQuery<Student> query = session.createQuery(hql, Student.class);
			query.setParameter("email", email);
			Student student = query.getSingleResult();;
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	@Override
	public boolean validateStudent(String email, String password) {
		
		Student student = getStudentByEmail(email);
		
		return student != null && student.getsPass().equals(password);
	}
	
	public void registerStudentToCourse(String email, Integer courseId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
	  
	    try {
	    	session.beginTransaction(); 
	    	
	    	//find stud and course 
	    	Student student = session.get(Student.class, email);
	    	Course course = session.get(Course.class, courseId);
	    	
	    	// check if already registered
	    	
	    	if(!student.getsCourses().contains(course)) {
	    		student.getsCourses().add(course);
	    		
	    		session.update(student);
	    	}
	    	session.getTransaction().commit();
	    }catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	@Override
	public List<Course> getStudentCourses(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		try {
			String hql = "SELECT c FROM Student s JOIN s.sCourses c WHERE s.sEmail = :email";
			TypedQuery<Course> query = session.createQuery(hql, Course.class);
			query.setParameter("email", sEmail);
			
			List<Course> courses = query.getResultList();
			return courses;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public void save(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
			session.saveOrUpdate(student);
			t.commit();
			session.close();
		
	}
	

//	public static void main(String[]args) {
//		StudentService studentService = new StudentService();
////		List<Student> students = studentService.getAllStudents();
////		for(Student s : students) {
////			System.out.println(s.getsEmail() + " | " + s.getsName() + " | " + s.getsPass());
////		}
//		
//		Student stud = studentService.getStudentByEmail("student101@gett.edu");
//		
//		System.out.println(stud.getsName() + " | " + stud.getsPass());
//		
//	}
//	

}
