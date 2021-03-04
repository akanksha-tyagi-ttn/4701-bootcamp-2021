package com.springbootstart.spring1;

import org.springframework.stereotype.Component;

@Component
public class Car implements TravelJourney{
    @Override
    public void go() {
        System.out.println("Go by car");
    }
}
