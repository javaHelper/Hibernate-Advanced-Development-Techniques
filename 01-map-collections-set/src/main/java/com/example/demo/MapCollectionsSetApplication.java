package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MapCollectionsSetApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MapCollectionsSetApplication.class, args);
    }

    @Autowired
    private StudentRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<String> images1 = Arrays.asList("photo1.jpg", "photo2.jpg", "photo3.jpg", "photo4.jpg", "photo5.jpg");
        List<String> images2 = Arrays.asList("photo1.jpg", "photo2.jpg", "photo3.jpg");

        Student student = Student.builder().firstName("Matt").lastName("Wixon").email("matt.wixson@gmail.com")
                .images(new HashSet<>(images1))
                .build();

        Student student2 = Student.builder().firstName("Jane").lastName("Doe").email("jane.doe@gmail.com")
                .images(new HashSet<>(images2))
                .build();

        repository.saveAll(Arrays.asList(student, student2));
    }
}