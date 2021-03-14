package com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.service;

import com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.entities.Employee;
import com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    //returns the list of employees (select statement)
    public List<Employee> getAllEmployees() {
        List<Employee> listEmp=new ArrayList<>();
        empRepo.findAllEmployees()
                .forEach(emp->listEmp.add(emp));
        return listEmp;
    }

    //inserting employees
    public void saveEmployee(Employee emp){
        empRepo.save(emp);
    }

    //question 1 of JPQL
    public List<Object[]> question1Partial(){
        List<Object[]> listObjectEmployee=empRepo.findAllEmployeePartialData();
        return listObjectEmployee;
    }

    //question 2 of JPQL
    public int updateEmpSalary(Double increment){
        double average=empRepo.findAVGSalary();
        System.out.println("average salary: "+average);
        return empRepo.updateEmployeeSalary(increment,average);
    }

    //DELETE THE EMPLOYEE WITH MINIMUM SALARY
    @Transactional
    public int deleteEmployee(Double salary){
        //System.out.println("average salary: "+empRepo.findAVGSalary());
        return empRepo.deleteAllEmployeesMinSalary(salary);
    }

    //native query

    //Display the id, first name, age of all employees where
    // last name ends with "singh"
    public List<Object[]> employeeWithLastNameNQ(String lastname){
        return empRepo.employeesWithLastName(lastname);
    }

    //Delete all employees with age greater than 45
    // (Should be passed as a parameter)
    @Transactional
    public int deleteEmployeeAge45(int age){
        return empRepo.deleteEmployeeAgeGreaterThan45(age);
    }


    public long countTableRows() {
        return empRepo.count();
    }
    }
