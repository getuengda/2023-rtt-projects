package jpa.service;

import java.util.List;


import javax.persistence.TypedQuery;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;


public class CourseService implements CourseDAO {

	public CourseService() {

	}

	@Override
	public List<Course> getAllCourses() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			
			session.beginTransaction();

			String hql = "FROM Course";
			TypedQuery<Course> query = session.createQuery(hql, Course.class);
			List<Course> courses = query.getResultList();

			session.getTransaction().commit();
			return courses;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Course getCourseById(Integer cId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {

			String hql = "FROM Course c WHERE c.cId = :courseId";
			TypedQuery<Course> query = session.createQuery(hql, Course.class);
			query.setParameter("courseId", cId);
			return query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void save(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(course);
		t.commit();
		session.close();
	}

}
