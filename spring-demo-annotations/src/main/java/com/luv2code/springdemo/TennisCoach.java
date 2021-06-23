package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
   @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    /*@Autowired
    public TennisCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }*/
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setting fortune Object");
        this.fortuneService = fortuneService;
    }*/
    public String getDailyWorkout()
    {
        return "practice your backhand valley";
    }
   public String getDailyFortune()
   {
       return fortuneService.getFortune();
   }
}
