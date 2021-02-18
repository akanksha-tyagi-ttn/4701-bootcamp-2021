package com.collections;

import java.text.SimpleDateFormat;
import java.util.*;

public class DifferentCountryTimeZone {
    public  static void main(String[] args)
    {
        displayDate();
    }
    static void displayDate() {
        Date today=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println("Time Zone in India: "+dateFormat.format(today));

        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Karachi"));
        System.out.println("Time Zone in Pakistan: "+dateFormat.format(today));

        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println("Time Zone in America: "+dateFormat.format(today));

        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        System.out.println("Time Zone in Australia: "+dateFormat.format(today));

    }
}

