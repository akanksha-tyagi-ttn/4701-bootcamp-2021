package com.Java_8;
import java.util.*;
import java.util.function.*;

public class Question_1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the choice: \n1.check one is greater than other." +
                "\n2.increment by one" +
                "\n3.concat 2 strings"+
                "\n4.convert to uppercase:  ");
        int choice=input.nextInt();
        switch(choice) {
            case 1: System.out.println("Enter the two numbers:  ");
                    int num1 = input.nextInt(); int num2 = input.nextInt();
                    greaterThanOther(num1,num2);  break;
            case 2: System.out.println("Enter the number:  ");
                    int number=input.nextInt();
                    incrementByOne(number); break;
            case 3: System.out.println("Enter the two Strings:  ");
                    String string1=input.next(); String string2=input.next();
                    concatenateStrings(string1,string2); break;
            case 4: System.out.println("Enter the String:  ");
                    String str=input.next();
                    convertToUpperCase(str); break;
            default: System.out.println("the wrong choice!! ");
        }  // switch
    }
    static void greaterThanOther(int num1,int num2) {
        System.out.println("Check one is greater than other or not: ");
        BiFunction<Integer,Integer,Boolean> isGreater=(x, y)->x>y;
        System.out.println(isGreater.apply(num1,num2));
    } //greater

    static void incrementByOne(int num1){
        System.out.println("\nIncrement by one: ");
        Function<Integer,Integer> incrementBy1=x->x+1;
        System.out.println("The number is: (before increment) "+ num1);
        System.out.println("The number is: (after increment) "+ incrementBy1.apply(num1));
    }// increment

    static void concatenateStrings(String str1,String str2) {
        System.out.println("Concatenate two strings: ");
        BinaryOperator<String> concatStrings=(s1,s2)->s1+s2;
        System.out.println("The concatenated string is: "+concatStrings.apply(str1,str2));
    }// concat

    static  void convertToUpperCase(String str){
        Function<String,String> toStringUppercase=(x)->x.toUpperCase();
        System.out.println("The uppercase of string 1 is : "+toStringUppercase.apply(str));
    } // uppercase
}
