package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {

    @GetMapping
    public List<Course> getCourse() {
        return List.of(new Course(1L, "Learn Spring Boot", "in28minutes"),
                new Course(2L, "AWS", "in28minutes"),
                new Course(3L, "Kubernetes", "in28minutes"),
                new Course(4L, "Azure", "in28minutes"),
                new Course(5L, "Docker", "in28minutes")
        );
    }
}
