package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class myCoolAppRestController {

    @Value("${coach.name}")
    private String coachName;

    // expose  "/" that gives acknowledgement for tomcat server running status
    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is "+ LocalDateTime.now()+"\t -->"+" coach : "+coachName;
    }
}
