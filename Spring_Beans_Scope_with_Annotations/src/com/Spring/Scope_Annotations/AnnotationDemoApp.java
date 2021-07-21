package com.Spring.Scope_Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/Spring/Scope_Annotations/applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		boolean result= (theCoach==alphaCoach);
		System.out.println(result);

		System.out.println("Memory - > "+theCoach);

		System.out.println("Memory - > "+alphaCoach);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();	
	}

}


