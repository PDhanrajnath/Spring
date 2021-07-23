package com.Spring.springioc;

public class BaseBallCoach implements Coach {
    private int times;

    @Override
    public String getDailyWorkout() {

        return times+" x Spend 30 min's on batting practice";
    }

    @Override
    public int setWorkout(int times) {
        this.times = times;
        return 1;
    }
}
