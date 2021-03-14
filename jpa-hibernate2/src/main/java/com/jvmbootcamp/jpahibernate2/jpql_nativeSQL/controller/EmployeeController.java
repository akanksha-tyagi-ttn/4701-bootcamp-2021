package com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.controller;

import com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.entities.Employee;
import com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    //localhost:8080/jpa2-employeeData
    @GetMapping("/jpa2-employeeData")
    public List<Employee> getAll(){
        return service.getAllEmployees();
    }

    //localhost:8080/jpa2-employeeData  (in post)
    @PostMapping("/jpa2-employeeData")
    public String insertEmployee(@RequestBody Employee employee){
        service.saveEmployee(employee);
        return employee.getEmpFirstName()+" created";
    }

    //localhost:8080/jpa2-partialData-q1
    @GetMapping("/jpa2-partialData-q1")
    public Map<String,String> firstQuestion_displayConditions(){
        List<Object[]>data=service.question1Partial();
        //formatting the output-------
        Map<String,String> map = null;
        if(data != null && !data.isEmpty()){
            map = new HashMap<>();
            int i=1;
            for (Object[] object : data) {
                map.put("Employee "+i+" :",object[0].toString()+" "+object[1].toString());
                i++;
            }
        }
        return map;
    }

    //localhost:8080/jpa2-updateEmployeeOn/500
    @GetMapping("/jpa2-updateEmployeeOn/{increment}")
    public String question2Update(@PathVariable double increment){
        service.updateEmpSalary(increment);
        return service.updateEmpSalary(increment)+ " employees updated";
    }

    //localhost:8080/jpa2-deleteEmployeeWith/6000
    @GetMapping("/jpa2-deleteEmployeeWith/{salary}")
    public String question3Delete(@PathVariable Double salary){
        return service.deleteEmployee(salary)+ " employees With Minimum Salary Deleted";
    }
    //native sql query

    //localhost:8080/jpa2-employeeWithLastname=singh
    @GetMapping("/jpa2-employeeWithLastname={lastname}")
    public Map<String,String> question1_NQ_display(@PathVariable String lastname){
        List<Object[]>data=service.employeeWithLastNameNQ(lastname);
        //formatting the output-------
        Map<String,String> map = null;
        if(data != null && !data.isEmpty()){
            map = new HashMap<>();
            int i=1;
            for (Object[] object : data) {
                map.put("id: "+object[0].toString()," name: "+object[1].toString() +
                        " and age: "+object[2].toString());
                i++;
            }
        }
        return map;
    }

    //localhost:8080/jpa2-employeeWithAgeGreaterThan=45
    @GetMapping("/jpa2-employeeWithAgeGreaterThan={age}")
    public String question2_NQ_delete(@PathVariable int age){
        return service.deleteEmployeeAge45(age)+" employees deleted whose age is " +
                "greater than 45";
    }
}
