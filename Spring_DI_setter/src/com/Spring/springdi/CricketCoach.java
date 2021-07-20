package com.Spring.springdi;

public class CricketCoach implements Coach {

    private  FortuneService fortuneService;

    //create no-argument constructor
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-argument constructor!");
    }

    //setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
