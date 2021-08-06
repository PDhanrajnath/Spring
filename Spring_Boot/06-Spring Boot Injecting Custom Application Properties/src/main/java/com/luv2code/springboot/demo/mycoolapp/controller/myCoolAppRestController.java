package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class myCoolAppRestController {

    //injecting properties (Custom properties)
    @Value("${coach.name}")
    private String coachName;

    @Value("${sport.name}")
    private String sport;

    // expose  "/" that gives acknowledgement for tomcat server running status
    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }

    // expose a new end point for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    //expose a new endpoint for "/fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your Lucky Day!!";
    }

    //expose a new endpoint for custom properties file
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name: "+coachName+"  Sport: "+sport;
    }

}
