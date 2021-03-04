package com.springbootstart.spring1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JourneyClass {
    private TravelJourney travel;
    @Autowired
    public JourneyClass(TravelJourney travel) {
        this.travel = travel;
    }

    void startJourney() {
        System.out.println(travel);
        travel.go();
    }
}
