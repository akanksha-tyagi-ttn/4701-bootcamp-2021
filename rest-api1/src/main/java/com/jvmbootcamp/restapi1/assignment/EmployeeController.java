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

    // url : http://localhost:8080/retrieveEmployee/101  (in GET)
    @GetMapping("/retrieveEmployee/{id}")
    public Employee getOneEmployeeMapper(@PathVariable int id) {
        Employee emp=service.getOneEmployee(id);
        if(emp==null)
            throw new EmployeeNotFoundException("id-"+ id);

        return emp;
    }

    // url :  http://localhost:8080/retrieveEmployee/101 (in DELETE)
    @DeleteMapping("/retrieveEmployee/{id}")
    public void deleteByIdEmployeeMapper(@PathVariable int id) {
        Employee emp=service.deleteById(id);
        if(emp==null)
            throw new EmployeeNotFoundException("id-"+ id);
    }

    /*request coming from postman in the form of json file */
    //  url : http://localhost:8080/retrieveEmployee (in POST)
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

    // url : http://localhost:8080/retrieveEmployee/101 (in PUT request)
    @PutMapping ("/retrieveEmployee/{id}")
    public ResponseEntity<Object> updateEmployeeByIdMapper(@PathVariable int id,
                                                           @Valid @RequestBody Employee getEmp)
    {
        Employee updatedEmp=service.getOneEmployee(id);
        if(updatedEmp==null)
            throw new EmployeeNotFoundException("incorrect id!!");

        updatedEmp.setId(getEmp.getId()); // retrieving id from parameter emp
        updatedEmp.setName(getEmp.getName()); // name from parameter emp
        updatedEmp.setAge(getEmp.getAge()); // age from parameter emp
        return ResponseEntity.ok(updatedEmp);
    }
}
