package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }
    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
    public void myStartUpMethod()
    {
        System.out.println("Inside my Startup method");
    }
    public void myDestroyMethod()
    {
        System.out.println("Inside my Destroy method");
    }
}
