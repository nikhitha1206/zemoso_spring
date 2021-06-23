package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String name;
    public CricketCoach()
    {
        System.out.println("Cricket coach:");
    }
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter methods");
        this.fortuneService = fortuneService;
    }
    public void setEmailAddress(String emailAddress) {
        System.out.println("setter methods");
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        System.out.println("setter methods");
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 minutes on bowling practice";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
