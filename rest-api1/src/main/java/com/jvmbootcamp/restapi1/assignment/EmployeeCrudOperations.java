package com.jvmbootcamp.restapi1.assignment;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class EmployeeCrudOperations {
    private static List<Employee> listEmp=
            new ArrayList<>();
    private static int empCount=105;
    static {
        listEmp.add(new Employee(101,"akanksha",24));
        listEmp.add(new Employee(102,"narayani",23));
        listEmp.add(new Employee(103,"mudit",18));
        listEmp.add(new Employee(104,"sakshiJain",25));
        listEmp.add(new Employee(105,"tanya",22));
    }

    public List<Employee> getAllEmployee(){
        return listEmp;
    }

    public Employee addEmployee(Employee emp){
        if(emp.getId()==null) {
            emp.setId(++empCount);
        }
        listEmp.add(emp);
        return emp;
    }

    public Employee getOneEmployee(int id){
        for(Employee emp:listEmp){
            if(emp.getId()==id)
                return emp;
        }
        return null;
    }

    public Employee deleteById(int id){
        Iterator<Employee> itrEmp=listEmp.iterator();
        while(itrEmp.hasNext()) {
            Employee emp=itrEmp.next();
            if(emp.getId()==id){
                itrEmp.remove();
                return emp;
            }
        }
        return null;
    }

    public Employee updateEmployee(Employee emp) {
        if(listEmp.contains(emp)) {
            listEmp.add(0,emp);
            return emp;
        }
        return null;
    }
}
