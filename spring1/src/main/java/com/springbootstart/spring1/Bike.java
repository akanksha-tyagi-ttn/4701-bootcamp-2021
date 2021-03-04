package com.springbootstart.spring1;
import org.springframework.context.annotation.Primary;

public class Bike implements TravelJourney{

    @Override
    public void go() {
        System.out.println("go by Bike......");
    }
}
