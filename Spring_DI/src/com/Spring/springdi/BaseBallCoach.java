package com.Spring.springdi;


public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;
    public BaseBallCoach(FortuneService thefortuneservice){
        fortuneService=thefortuneservice;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min's on batting practice";
    }
}
