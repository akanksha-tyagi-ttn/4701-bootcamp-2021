package com.jvmbootcamp.jpahibernate2.component_mapping.controller;
import com.jvmbootcamp.jpahibernate2.component_mapping.entities.EmployeeMapping;
import com.jvmbootcamp.jpahibernate2.component_mapping.services.EmployeeSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeSalaryController {
    @Autowired
    EmployeeSalaryService service;

    //http://localhost:8080/create-employeeWithSalary
    @PostMapping("/create-employeeWithSalary")
    public String employeeCreate(@RequestBody EmployeeMapping emp)
    {
        service.employeeCreate(emp);
        return "User Added";
    }
    //http://localhost:8080/allEmployeeWithSalary
    @GetMapping("/allEmployeeWithSalary")
    public List<EmployeeMapping> findAllEmployee()
    {
        List<EmployeeMapping> employees = service.findAllEmployee();
        return employees;
    }
}
