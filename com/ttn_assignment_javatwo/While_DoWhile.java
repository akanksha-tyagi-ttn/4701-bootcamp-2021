package com.ttn_assignment_javatwo;
import java.util.Scanner;

public class While_DoWhile
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        doWhile_While_Method();
    }  //main
    static void doWhile_While_Method()
    {
        System.out.println("Enter the choice: \n1. while \n2.Do-while : ");
        int choice=input.nextInt();
        switch (choice)
        {
            case 1: System.out.println("while loop \nStart writing , write done to stop: ");
                    String word=input.next();
                    while(!word.equals("done"))
                    {
                        if(word.charAt(0)==word.charAt(word.length()-1))
                            System.out.println("First word and last word of "+
                                    word+" are same.");
                        else
                            System.out.println("First word and last word of "+
                                    word+" are NOT same.");
                        word=input.next();
                    }
                    break;
            case 2:  System.out.println("Do while loop \nStart writing , write done to stop: ");
                    String word_do=input.next();
                    do {
                        if (word_do.charAt(0) == word_do.charAt(word_do.length() - 1))
                            System.out.println("First word and last word of " +
                                    word_do + " are same.");
                        else
                            System.out.println("First word and last word of " +
                                    word_do + " are NOT same.");
                        word_do = input.next();
                    }while(!word_do.equals("done"));
                    break;
            default: System.out.println("wrong choice! ");
        }  //switch case
    }
}

