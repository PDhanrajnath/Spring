package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTController {

    //define endpoint "/students"  --> return a list of students

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> myStudents = new ArrayList<>();

        myStudents.add(new Student("Poornima","Patel"));
        myStudents.add(new Student("Mario","Rossi"));
        myStudents.add(new Student("Mary","Patel"));

        return myStudents;
    }

}
