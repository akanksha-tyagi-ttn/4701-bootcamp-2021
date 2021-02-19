package com.Java_8;
import java.util.*;
import java.util.function.BiFunction;

class Arithmetic {
    public int add (int num1,int num2){
        return num1+num2;  }
    public int subtract(int num1,int num2){
        return num1-num2; }
    public  static int multiply(int num1,int num2){
        return num1*num2; }
}
public class Static_InstanceMethod {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 2 numbers: ");
        int num1=input.nextInt(); int num2=input.nextInt();
        //---------------------instance method---------------------
        BiFunction<Integer,Integer,Integer> adder=new Arithmetic()::add;
        System.out.println("Sum of 2 numbers: "+adder.apply(num1,num2));

        BiFunction<Integer,Integer,Integer> subtract=new Arithmetic()::subtract;
        System.out.println("\ndifference of 2 numbers: "+subtract.apply(num1,num2));

        //-----------------------static method----------------------------
        BiFunction<Integer,Integer,Integer> multiplication=Arithmetic::multiply;
        System.out.println("\nMultiplication of 2 numbers: "+multiplication.apply(num1,num2));
    }
}
