package com.example.demo;

import com.example.demo.model.Status;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private UserRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = User.builder().firstName("Jane").lastName("Doe").email("jane.doe@gmail.com").status(Status.ACTIVE).build();
        User user2 = User.builder().firstName("John").lastName("Doe").email("john.doe@gmail.com").status(Status.ACTIVE).build();

        repository.saveAll(Arrays.asList(user1,user2));
    }
}