package com.Spring.springdi;


public class BaseBallCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseBallCoach(FortuneService thefortuneservice){
        fortuneService=thefortuneservice;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min's on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
