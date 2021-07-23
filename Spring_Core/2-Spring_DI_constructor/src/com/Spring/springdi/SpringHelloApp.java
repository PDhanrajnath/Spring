package com.Spring.springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach baseCoach = context.getBean("baseCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(baseCoach.getDailyWorkout());

        //let's call out method for fortunes
        System.out.println(theCoach.getDailyFortune());
        System.out.println(baseCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
