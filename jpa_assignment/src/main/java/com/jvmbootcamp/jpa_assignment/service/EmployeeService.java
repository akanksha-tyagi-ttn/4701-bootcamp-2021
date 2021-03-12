package com.jvmbootcamp.jpa_assignment.service;

import com.jvmbootcamp.jpa_assignment.entities.EmployeeDetails;
import com.jvmbootcamp.jpa_assignment.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    //returns the list of employees (select statement)
    public List<EmployeeDetails> getAllEmployees() {
        List<EmployeeDetails> listEmp=new ArrayList<>();
        empRepo.findAll()
                .forEach(emp->listEmp.add(emp));
        return listEmp;
    }

    public EmployeeDetails getEmployeesById(int id) {
        return empRepo.findById(id).get();
    }

    public void saveEmployee(EmployeeDetails emp){
        empRepo.save(emp);
    }

    public void deleteEmployeeById(int id){
        if(empRepo.existsById(id))
            empRepo.deleteById(id);
    }

    public EmployeeDetails updateEmpById(int id,EmployeeDetails emp){
        if(empRepo.existsById(id))
        {
            EmployeeDetails temp=empRepo.findById(id).get();
            temp.setName(emp.getName());
            temp.setAge(emp.getAge());
            temp.setLocation(emp.getLocation());
            empRepo.save(temp);
            return temp;
        }
        else{
            empRepo.save(emp);
            return emp;
        }
    }

    public long countTableRows() {
        return empRepo.count();
    }

    public List<EmployeeDetails> findByNameMethod(String nameToFind){
        return empRepo.findByName(nameToFind);
    }

    public List<EmployeeDetails> findBetweenAges(int low,int high){
        return empRepo.findByAgeBetween(low,high);
    }

    public List<EmployeeDetails> findNameLike(String name){
        return empRepo.findByNameLike(name);
    }

    public List<EmployeeDetails> sortByAge(){
            Pageable pageable = PageRequest.of(0,3, Sort.Direction.DESC,"age");
            List<EmployeeDetails> employeeList = (List<EmployeeDetails>) empRepo.findAll(pageable);
            return employeeList;
        }
    }
