package com.Spring.springioc;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {

        return "Spend 30 min's on batting practice";
    }
}
