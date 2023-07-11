package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instructor extends User {

	private Double salary;

	
	public Instructor(String firstName, String lastName, String email, Double salary) {
		super(firstName, lastName, email);
		this.salary = salary;
	}
}
