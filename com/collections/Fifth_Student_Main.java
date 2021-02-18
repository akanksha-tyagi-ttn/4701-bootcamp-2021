package com.collections;

import java.util.*;

public class Fifth_Student_Main {
    public static void main(String[] args)
    {
        List<Fifth_Student> student_list=new ArrayList<Fifth_Student>() {
            {
                add(new Fifth_Student("Akanksha", 34, 450));
                add(new Fifth_Student("Suresh", 30, 256));
                add(new Fifth_Student("Jagesh", 20, 430));
                add(new Fifth_Student("Akansha", 45, 450));
                add(new Fifth_Student("Jayashri", 18, 160));
                add(new Fifth_Student("Zeba", 22, 430));
            }
        };

        System.out.println("unsorted List"+"\n"+student_list);

        System.out.println("Sorting on the basis of Score: ");
        Collections.sort(student_list,new Fifth_ScoreComparator());
        System.out.println("Sorted List:(increasing order )\n"+student_list);
    }
}
