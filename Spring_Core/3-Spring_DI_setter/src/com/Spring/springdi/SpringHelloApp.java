package com.Spring.springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve from spring container
        CricketCoachDetailed theCoach = context.getBean("myCricketCoachDetailed",CricketCoachDetailed.class);
        CricketCoachDetailed myCoach = context.getBean("myCricketCoachDetailed",CricketCoachDetailed.class);
        boolean result= (theCoach == myCoach);
        if(result){
            System.out.println("Objects are same!");
        }
        else
        {
            System.out.println("Objects are different!");
        }

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyWorkout());

        //let's call out method for fortunes
        System.out.println(theCoach.getDailyFortune());
        System.out.println(myCoach.getDailyFortune());
        //call out new methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        System.out.println(myCoach.getEmailAddress());
        System.out.println(myCoach.getTeam());
        //close the context
        context.close();
    }
}
