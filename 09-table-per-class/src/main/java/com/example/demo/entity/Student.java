package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student extends User {

	private String course;

	public Student(String firstName, String lastName, String email, String course) {
		super(firstName, lastName, email);
		this.course = course;
	}
}
