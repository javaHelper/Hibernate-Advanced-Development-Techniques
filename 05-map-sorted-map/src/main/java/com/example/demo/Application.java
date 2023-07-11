package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
public class Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Student student = Student.builder().firstName("John").lastName("Doe").email("john.doe@gmail.com").images(new TreeMap<>()).build();
		Map<String, String> theImages = student.getImages();

		theImages.put("photo1.jpg", "Photo 1");
		theImages.put("photo2.jpg", "Photo 2");
		theImages.put("photo3.jpg", "Photo 3");

		repository.save(student);


	}
}