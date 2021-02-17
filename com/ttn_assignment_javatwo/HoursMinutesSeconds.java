package com.ttn_assignment_javatwo;

import java.util.Scanner;

public class HoursMinutesSeconds
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the seconds");
        int seconds=input.nextInt();
        convertIntoH_M_S(seconds);
    }
    static void convertIntoH_M_S(int seconds)
    {
        // calculating days          //remainder hour,minutes and seconds
        int days=seconds/(3600*24);  seconds=seconds%(3600*24);
        //calculating hours       //remainder minutes+seconds
        int hours=seconds/3600;  seconds=seconds%3600;
        //calculating minutes    //calculating seconds
        int minutes=seconds/60;  seconds%=60;

        System.out.println("There are \n"+days+" days \n"+hours+" hours\n"
                +minutes+" minutes \n"+seconds+" seconds..");
    }
}
