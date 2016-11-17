package ca.alexcochrane.j2ee.tutorial11.model;

public class User {
	
	private int id;
	private int age;
	private String name;
	
	private User(){}
	
	public User(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public int getID() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
