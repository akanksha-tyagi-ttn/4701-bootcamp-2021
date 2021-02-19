package com.Java_8;
import java.util.*;
import java.util.function.*;

public class PredefinedFunctional_Q5 {
    public static void main(String[] args)
    {
        List<Integer> integerList=Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));

       System.out.print("Consumer Functional interface:: \nPrint every number:: ");
        Consumer<Integer> consumer= i-> System.out.print(i+" ");
        integerList.stream().forEach(consumer); System.out.println();

        //predicate interface
        System.out.print("\nPredicate Functional Interface:: "
                +"\nPrint every positive and even integer:\n");
        Predicate<Integer> isEven_Positive=x->x%2==0 && x>0;
        integerList.stream().filter(isEven_Positive).forEach(consumer); System.out.println();

        //Function
        System.out.print("\nFunction Functional Interface:: "
                +"\nPrint square of every number:\n");
        Function<Integer,Integer> squareInt=x->x*x;
        integerList.stream().map(squareInt).forEach(consumer); System.out.println();

        //supplier
        System.out.print("\nSupplier Functional Interface:: "
                +"\nPrint today's date:\n");
        Supplier<Date> dateSupplier= PredefinedFunctional_Q5::getSystemDate;
        Date systemDate = dateSupplier.get();
        System.out.println("systemDate->" + systemDate);
    }
    public static Date getSystemDate()
    { return new Date();}
}
