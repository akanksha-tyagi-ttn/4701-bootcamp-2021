package com.Java_8;
import java.util.Scanner;

@FunctionalInterface
interface EmployeeFunctionalInterface
{
    Employee getEmployee(String name,int age,String city);
}
class Employee {
    String name,city;
    Integer age;
    public Employee(String name,int age,String city){
        this.name=name; this.age=age; this.city=city;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age; }
    public String toString(){
        return "Name: "+this.name+
                "\nAge: "+this.age+
                "\nCity: "+this.city;
    }
}
public class ConstructorReference_Q4 {
    static Scanner input=new Scanner(System.in);
    public static  void main(String[] args){
        EmployeeFunctionalInterface empData=Employee::new;
        System.out.print(".....Constructor reference is assigned to interface....\n");
        System.out.println("Enter the name, age , city : ");
        String name=input.next(); int age=input.nextInt(); String city=input.next();
        System.out.println("Instance of class Employee is created now: ");
        Employee emp=empData.getEmployee(name,age,city);
        System.out.println("The Employee data:: ");
        System.out.print(emp);
    }
}
