package com.Spring.JavaAnnotaions_DefaultComponent;

import org.springframework.stereotype.Component;

@Component()
public class TrackCoach implements Coach1 {
    @Override
    public String getDailyWorkout() {
        return "Run 5k";
    }
}
