package com.Spring.springioc;

public class TrackCoach implements  Coach{
    private int times;
    @Override
    public String getDailyWorkout() {

        return times+ " x Run a hard 5K!";
    }

    @Override
    public int setWorkout(int times) {
        this.times=times;
        return 1;
    }
}
