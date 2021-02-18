package com.collections;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateParticularFormat {
    public static void main(String[] args)
    {
        dateFormatAccordingly();
    }
    static void dateFormatAccordingly()
    {
        SimpleDateFormat date_format=new SimpleDateFormat("dd-MMM-yyyy");
        Calendar c = Calendar.getInstance();
        System.out.println("Present Date : " + c.getTime());
        String formattedDate = date_format.format(c.getTime());
        System.out.println("Date formatted : "+formattedDate);
    }
}
