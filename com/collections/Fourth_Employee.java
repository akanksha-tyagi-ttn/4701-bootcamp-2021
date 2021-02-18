package com.collections;
public class Fourth_Employee {
    String name; double age,salary;
    public Fourth_Employee()  {}  //default ctr
    public Fourth_Employee(String name,double age,double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString()
    {
        return "Name: "+this.name+
                "\tAge: "+this.age+
                "\tSalary: "+this.salary+"\n";
    }
}
