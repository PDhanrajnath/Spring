package com.Spring.JavaAnnotaions_DefaultComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultAnnotationDemoApp {
    public static void main(String[] args){

        //read spring config file
        ClassPathXmlApplicationContext context=
            new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach1 theCoach= context.getBean("trackCoach",Coach1.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close context
        context.close();
    }
}
