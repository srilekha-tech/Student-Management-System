package com.app1.model;

//model-plain old java object(pojo) class
public class Students {
	//columns in the database
	private int id;
	private String name;
	private String email;
	private String course;
	
	public Students() {}
	
	//used when updating or fetching from DB
	public Students(int id, String name, String email, String course) {
		this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
	}
	//used when adding (insert)
	public Students( String name, String email, String course) {
		this.name=name;
		this.email=email;
		this.course=course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
