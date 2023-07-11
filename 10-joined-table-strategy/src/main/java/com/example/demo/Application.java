package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.Student;
import com.example.demo.repository.InstructorRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class Application implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
    private StudentRepository studentRepository;
    @Autowired
    private InstructorRepository instructorRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Student student = new Student("John", "Doe", "john.doe@gmail.com", "Hibernate");
        Instructor instructor = new Instructor("Jane", "Doe", "jane.doe@gmail.com", 20000.00);

        studentRepository.save(student);
        instructorRepository.save(instructor);
		
	}

}
