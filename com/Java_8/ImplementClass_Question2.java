package com.Java_8;
import java.util.Scanner;

@FunctionalInterface
interface MultiplyInterface
{
    public int multiple(int a,int b);
}
public class ImplementClass_Question2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        MultiplyInterface multiplyFunc=(x,y)->x*y;
        System.out.print("The answer of multiplication of 2 numbers are:  "+
                multiplyFunc.multiple(num1,num2));
    }
}
