package com.collections;
import java.util.*;

public class Fourth_Employee_Main
{
    public  static void main(String[] args) {
        Fourth_Employee e1 = new Fourth_Employee("Ramesh", 34, 45000);
        Fourth_Employee e2 = new Fourth_Employee("Suresh", 30, 15600);
        Fourth_Employee e3 = new Fourth_Employee("Jagesh", 20, 4200);
        Fourth_Employee e4 = new Fourth_Employee("Rupali", 45, 63400);
        Fourth_Employee e5 = new Fourth_Employee("Jayant", 18, 200);
        Fourth_Employee e6 = new Fourth_Employee("Neha", 22, 9540);

        List<Fourth_Employee> emp_list = new ArrayList<>();
        emp_list.add(e1); emp_list.add(e2); emp_list.add(e3);
        emp_list.add(e4); emp_list.add(e5); emp_list.add(e6);

        System.out.println("unsorted List"+"\n"+emp_list);

        System.out.println("Sorting on the basis of Salary: ");
        Collections.sort(emp_list,new Fourth_SalaryComparator());
        System.out.println("Sorted List:(increasing order )\n"+emp_list);
    }
}
