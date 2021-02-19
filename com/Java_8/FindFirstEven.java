package com.Java_8;
import java.util.*;

public class FindFirstEven {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(2), new Integer(-4),
                new Integer(101), new Integer(-10),
                new Integer(12), new Integer(0), new Integer(-2));

        System.out.println("list: ");
        System.out.println(integerList);

        int firstNumber=integerList.stream().filter(x->x%2==0).filter(x->x>3).findFirst().get();
        System.out.print("First even Number which is greater than 3:  "+firstNumber);
    }
}
