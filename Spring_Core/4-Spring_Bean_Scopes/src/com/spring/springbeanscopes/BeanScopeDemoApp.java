package com.spring.springbeanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        //check if they are same beans
        boolean result= (theCoach == alphaCoach);
        if(!result)
            System.out.println("Objects are not equal!");
        else
            System.out.println("Objects are equal");
        System.out.println(theCoach);
        System.out.println(alphaCoach);

        //close the context
        context.close();
    }
}
