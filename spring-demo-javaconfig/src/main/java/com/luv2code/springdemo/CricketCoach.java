package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach {
    @Value("${email}")
    private String email;
    @Value("${name}")
    private String name;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
