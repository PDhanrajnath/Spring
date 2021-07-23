package com.Spring.JavaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){

        //read spring config file
        ClassPathXmlApplicationContext context=
            new ClassPathXmlApplicationContext("com/Spring/JavaAnnotations/applicationContext.xml");
        //get the bean from spring container
        Coach theCoach= context.getBean("thatTennisCoach",Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close context
        context.close();
    }
}
