package com.ttn_assignment_javatwo;
import java.util.Scanner;

class RangeCheckException extends Exception
{
    String str_msg;
    public RangeCheckException(String msg)
    {
        super(msg);
        System.out.println(msg);
    }
}
public class CustomException
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("enter the age to check eligibility to job: ");
        int age_job_age=input.nextInt();
        try {
            eligibleForGovtJobs(age_job_age);
        } catch (RangeCheckException e) {
            e.getMessage();
            if(age_job_age>60) System.out.print("You have worked your whole life, now it's time"+
                    "\n to enjoy life");
            else
                System.out.print("You have to wait for "+ (18-age_job_age)+
                        " to start working");

        }
    }
    static void eligibleForGovtJobs(int age_check) throws RangeCheckException
    {
        if(age_check<18 || age_check >60 )
                throw new RangeCheckException("Not in the range of 18-60");
        else
            System.out.println("Welcome to the Job portal. "+
                    "\nclick to proceed further......");
    }
}
