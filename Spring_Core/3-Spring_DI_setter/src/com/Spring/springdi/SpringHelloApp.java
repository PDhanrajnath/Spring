package com.Spring.springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve from spring container
        CricketCoachDetailed theCoach = context.getBean("myCricketCoachDetailed",CricketCoachDetailed.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call out method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //call out new methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close the context
        context.close();
    }
}
