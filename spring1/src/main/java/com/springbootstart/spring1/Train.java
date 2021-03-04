package com.springbootstart.spring1;
import org.springframework.stereotype.Component;

public class Train implements TravelJourney{
    @Override
    public void go() {
        System.out.println("go by Train..");
    }
}
