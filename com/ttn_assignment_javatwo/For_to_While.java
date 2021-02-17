package com.ttn_assignment_javatwo;
public class For_to_While
{
    public static void main(String[] main)
    { /*
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++)
        {
            s = s + i;
            for (int j = i; j > 0; j--)
            {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s); //*/
        while_loop();
    }
    static void while_loop()
    {
        System.out.println("while loop::  ");
        int s=0, t=1;
        int i=0;
        while(i<10)
        {
            s=s+i;
            int j=i;
            while(j>0)
            {
                t=t*(j-i);
                j--;
            } //inner while loop
            s=s*t;
            System.out.println("T is "+ t);
            i++;
        }  //outer while loop
        System.out.println("S is "+s);
    }
}
