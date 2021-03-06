package com.spring.Annotations_and_Autowiring.Constructor_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorHelloApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/Annotations_and_Autowiring/Constructor_Injection/applicationContextConstructor.xml");

        // retrieve from spring container
//        Coach anotherCoach = context.getBean("trackCoach",Coach.class);
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(anotherCoach.getDailyWorkout());

        //let's call out method for fortunes
        System.out.println(theCoach.getDailyFortune());
//        System.out.println(anotherCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
