package com.Spring.springioc;

public class CricketCoach implements Coach{
    private int times;
    @Override
    public String getDailyWorkout() {
        return times+" x Spin Bowling practice for 30 min's";
    }

    @Override
    public int setWorkout(int times) {
        this.times = times;
        return 1;
    }
}
