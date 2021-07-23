package com.Spring.springioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args){
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve from spring container
        Coach theCoach = context.getBean("trackCoach",Coach.class);

        Coach alphaCoach = context.getBean("trackCoach",Coach.class);

        boolean result= (theCoach == alphaCoach);
        System.out.println(result+" Objects");

        Coach betaCoach = context.getBean("baseBallCoach",Coach.class);
        Coach betadCoach = context.getBean("baseBallCoach",Coach.class);

        result= (betaCoach == betadCoach);
        System.out.println(result+" Objects");

        Coach cricCoach = context.getBean("demoBean",Coach.class);
        Coach crickCoach = context.getBean("demoBean",Coach.class);

        result= (cricCoach == crickCoach);
        System.out.println(result+" Objects");

        //call methods on the bean
        theCoach.setWorkout(5);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyWorkout());

        betaCoach.setWorkout(6);
        System.out.println(betaCoach.getDailyWorkout());
        System.out.println(betadCoach.getDailyWorkout());

        cricCoach.setWorkout(7);
        System.out.println(cricCoach.getDailyWorkout());
        System.out.println(crickCoach.getDailyWorkout());
        //close the context
        context.close();
    }
}
