package com.Java_8;
import java.util.Arrays;
import java.util.List;

public class Average_Doubling_q11 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(2), new Integer(5),
                new Integer(101), new Integer(10),
                new Integer(12), new Integer(43), new Integer(22));

        System.out.println("list: ");
        System.out.println(integerList);

        integerList.stream().map(x->x*2)
                .mapToInt(i->i).average()
                .ifPresent(avg -> System.out.println("Average found is " + avg));
    }
}
