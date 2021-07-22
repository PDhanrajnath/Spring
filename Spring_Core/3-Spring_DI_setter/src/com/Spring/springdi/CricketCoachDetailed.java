package com.Spring.springdi;

public class CricketCoachDetailed implements Coach {

    private String emailAddress;
    private String team;
    FortuneService fortuneService;

    //create no-argument constructor
    public CricketCoachDetailed(){
        System.out.println("CricketCoach: inside no-argument constructor!");
    }

    //setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: inside setter method - setEmailAddress");

        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");

        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
