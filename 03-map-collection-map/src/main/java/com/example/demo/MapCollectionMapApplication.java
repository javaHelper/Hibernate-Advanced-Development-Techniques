package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MapCollectionMapApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MapCollectionMapApplication.class, args);
	}

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Student student = Student.builder().firstName("John").lastName("Doe").email("john.doe@gmail.com").images(new HashMap<>()).build();
		Map<String, String> images = student.getImages();

		images.put("photo1.jpg","Photo 1");
		images.put("photo2.jpg","Photo 2");
		images.put("photo3.jpg","Photo 3");

		repository.save(student);
	}
}