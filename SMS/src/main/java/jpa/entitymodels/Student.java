package jpa.entitymodels;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(unique = true, name = "email")
	private String sEmail;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_courses", joinColumns = @JoinColumn(name = "student_email"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> sCourses;

	@Column(name = "name", insertable = false, updatable = false)
	private String sName;

	@Column(name = "password", insertable = false, updatable = false)
	private String sPass;

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public Student() {

	}
}
