package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class SumIntegers_q10 {
    public static void main(String[] args)
    {
        List<Integer> integerList= Arrays.asList(new Integer(1),
                new Integer(2), new Integer(5),
                new Integer(101), new Integer(-10),
                new Integer(0),new Integer(43),new Integer(22));

        System.out.println("list: ");
        System.out.println(integerList);

        int sum=integerList.stream().filter(x->x>5).reduce(0,Integer::sum);
        System.out.print("sum of integers that are greater than 5:: \n"+sum);
    }
}
