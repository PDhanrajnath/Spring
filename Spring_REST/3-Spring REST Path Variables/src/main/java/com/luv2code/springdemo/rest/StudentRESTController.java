package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTController {
    
    //define a field
    private List<Student> theStudents;

    // define @PostConstruct to load the student data ...only once!
    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Mario","Rossi"));
        theStudents.add(new Student("Mary","Patel"));
    }


    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }
    
    //define endpoint "/students/{student_id}" --> return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        //populate the students ...

        //just index into the list ... keep it simple for now!

        return theStudents.get(studentId);
    }

}
