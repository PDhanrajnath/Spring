package com.spring.Annotations_and_Autowiring.Constructor_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5K hard!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
