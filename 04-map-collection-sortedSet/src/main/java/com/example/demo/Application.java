package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Student student = Student.builder().firstName("John").lastName("Doe").email("john.doe@gmail.com").images(new LinkedHashSet<>()).build();
		Set<String> theImages = student.getImages();

		theImages.add("photo1.jpg");
		theImages.add("photo2.jpg");
		theImages.add("photo3.jpg");
		theImages.add("photo4.jpg");
		theImages.add("photo4.jpg"); //Duplicate, filtered at java level by HashSet!!!
		theImages.add("photo5.jpg");
		theImages.add("photo5.jpg"); //Duplicate, filtered at java level by HashSet!!!

		repository.save(student);
	}
}