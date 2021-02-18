package com.collections;
import java.util.Comparator;

public class Fourth_SalaryComparator implements Comparator<Fourth_Employee>
{
    @Override  //sorted  on the basis of salary
    public int compare(Fourth_Employee o1, Fourth_Employee o2) {
        if(o1.getSalary()< o2.getSalary())
            return -1;
        else if(o1.getSalary()>o2.getSalary())
            return 1;
        else return 0;
    }
}
