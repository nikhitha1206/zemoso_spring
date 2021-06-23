package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;
    public String getDailyWorkout()
    {
        return "practice your backhand valley";
    }
   public String getDailyFortune()
   {
       return fortuneService.getFortune();
   }
}
