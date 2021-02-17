package com.ttn_assignment_javatwo;
import java.util.Scanner;
public class SortingString
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        SortingString obj=new SortingString();
        System.out.println("Enter the string to sort::  ");
        String stringToSort=input.nextLine();
        obj.sortStringMethod(stringToSort);
    }

    public void sortStringMethod(String stringToSort) {
        // converting it to char array
        System.out.println("The unsorted string is :: " + stringToSort);
        char[] stringToArray = stringToSort.toLowerCase().toCharArray();
        char temp = 0;
        for (int i = 0; i < stringToArray.length; i++)
        {
            for (int j = 0; j < stringToArray.length; j++)
            {
                if (stringToArray[j] > stringToArray[i])
                {
                    temp = stringToArray[i];
                    stringToArray[i] = stringToArray[j];
                    stringToArray[j] = temp;
                }  //if
            }  //for j
        }// for i

        System.out.print("the sorted string:: "); // print sorted string
        for (int i = 0; i < stringToArray.length; i++) {
            System.out.print(stringToArray[i]);
        }
    }   // sortStringMethod
}
