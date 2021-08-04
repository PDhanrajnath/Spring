package com.luv2code.springdemo.rest.entity;

import lombok.Data;

@Data
public class Student {

    private String firstName;
    private String lastName;

    public Student(){ }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //lombok getter/setter methods ...
}
