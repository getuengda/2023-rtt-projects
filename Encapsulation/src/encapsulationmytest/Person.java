package encapsulationmytest;

public class Person {
	private String name;
	private int age;
	private String company;
	private String job;
	private String hobby;
	
	public Person() {
		//empty constructor
	}
	
	public Person(String name, int age, String company, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.job = job;
		this.hobby = hobby;	
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCompany() {
		return company;
	}
	public String getJob() {
		return job;
	}
	public String getHobby() {
		return hobby;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCompany( String company) {
		this.company = company;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void talkaboutYourself() {
		System.out.println("Hi, I'm " + this.name + ".");
		System.out.println("I'm " + this.age + " years old. ");
		System.out.println("I work at " + this.company + "as a " + job + ",");
		System.out.println("When I get some free time, I like to " + this.hobby + ".");	
	}
}
