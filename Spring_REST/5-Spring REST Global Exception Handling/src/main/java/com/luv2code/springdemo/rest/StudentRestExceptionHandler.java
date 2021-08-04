package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.rest.entity.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    //add exception handling code here!

    //adding custom exception!  --> using @ExceptionHandler annotation
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){

        //create a student error response
        StudentErrorResponse error = new StudentErrorResponse();

        //set the values ...
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity!
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    //add another ExceptionHandler
    @ExceptionHandler
    public  ResponseEntity<StudentErrorResponse> handleException(Exception exception){

        //create a student error response
        StudentErrorResponse error = new StudentErrorResponse();

        //set the values ...
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity!
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }



}
