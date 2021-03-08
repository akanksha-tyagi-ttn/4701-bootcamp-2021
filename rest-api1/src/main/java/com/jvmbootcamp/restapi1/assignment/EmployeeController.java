package com.jvmbootcamp.restapi1.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeCrudOperations service;

    // url : http://localhost:8080/retrieveEmployee
    @GetMapping("/retrieveEmployee")
    public List<Employee> getAllEmpMapper() {
        return service.getAllEmployee();
    }

    //  http://localhost:8080/retrieveEmployee/101
    @GetMapping("/retrieveEmployee/{id}")
    public Employee getOneEmployeeMapper(@PathVariable int id) {
        Employee emp=service.getOneEmployee(id);
        if(emp==null)
            throw new EmployeeNotFoundException("id-"+ id);

        return emp;
    }

    @DeleteMapping("/retrieveEmployee/{id}")
    public void deleteByIdEmployeeMapper(@PathVariable int id) {
        Employee emp=service.deleteById(id);
        if(emp==null)
            throw new EmployeeNotFoundException("id-"+ id);
    }

    /*request coming from postman in the form of json file */
    @PostMapping("/retrieveEmployee")
    public ResponseEntity<Object> addEmployeeMapper(@Valid @RequestBody Employee emp){
        Employee createdEmp=service.addEmployee(emp);
        URI location=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdEmp.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping ("/retrieveEmployee")
    public ResponseEntity<Object> updateEmployeeMapper(@Valid @RequestBody Employee emp){
        Employee updatedEmp=service.updateEmployee(emp);
        if(updatedEmp==null)
            throw new EmployeeNotFoundException("incorrect id!!");
        URI location=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(updatedEmp.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
