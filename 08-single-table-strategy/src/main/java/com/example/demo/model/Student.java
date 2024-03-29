package com.example.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="STUDENT")
public class Student extends User {

	private String course;

	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email, String course) {
		super(firstName, lastName, email);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}