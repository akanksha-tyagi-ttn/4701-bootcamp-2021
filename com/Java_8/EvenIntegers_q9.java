package com.Java_8;
import java.util.*;
import java.util.stream.Collectors;

public class EvenIntegers_q9 {
    public static void main(String[] args)
    {
        List<Integer> integerList= Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0),new Integer(43),new Integer(22));

        System.out.println("list: ");
        System.out.println(integerList);

        List<Integer> evenIntegers=integerList.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.print("Even integers:: \n"+evenIntegers);
    }
}
