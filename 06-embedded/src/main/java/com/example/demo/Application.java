package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private StudentRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Address homeAddress = new Address("Main Street", "12345", "Nagpur");

        //2nd example:  Overriding embedded attributes
        Address billingAddress = new Address("Omkar Nagar", "444021", "Nagpur");

        Student.StudentBuilder studentBuilder = Student.builder().firstName("John").lastName("Doe").email("john.doe@gmail.com");
        studentBuilder.homeAddress(homeAddress);
        studentBuilder.billingAddress(billingAddress);

        Student student = studentBuilder.build();

        repository.save(student);
    }
}