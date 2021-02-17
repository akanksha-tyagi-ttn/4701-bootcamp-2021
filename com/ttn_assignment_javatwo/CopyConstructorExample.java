package com.ttn_assignment_javatwo;
class Employee
{
    int id; String name;
    public  Employee(int id,String name)  //parametrised constructor
    {
        System.out.println("Parameterised Constructor Invoked..");
        this.id=id; this.name=name;
    }
    public Employee(Employee emp)  //copy constructor
    {
        System.out.println("Copy Constructor invoked..");
        this.id=emp.id; this.name=emp.name;
    }
    //getter setter of id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //setter getter of name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "{{ Id:: "+ this.id+
                "\nname:: "+this.name+" }}";
    }
}
public class CopyConstructorExample
{
    public static void main(String[] args)
    {
        System.out.println("Employee 1:");
        Employee emp_one=new Employee(101,"Akanksha Tyagi");
        System.out.println(emp_one.toString());

        System.out.println("Employee 2 is copied from copy constructor:: ");
        Employee emp_two=new Employee(emp_one);
        System.out.println(emp_two.toString());

        System.out.println("\nchanging the contents of employee two:: ");
        emp_two.setId(155); emp_two.setName("New Employee Name");
        System.out.println("Employee 1:  "+emp_one.toString());
        System.out.println("Employee 2:  "+emp_two.toString());

    }
}
