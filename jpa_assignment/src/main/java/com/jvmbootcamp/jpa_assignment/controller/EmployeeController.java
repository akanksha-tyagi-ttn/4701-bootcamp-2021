package com.jvmbootcamp.jpa_assignment.controller;

import com.jvmbootcamp.jpa_assignment.entities.EmployeeDetails;
import com.jvmbootcamp.jpa_assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/employee-data")
    public List<EmployeeDetails> getEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/employee-data/{id}")
    public EmployeeDetails getSpecificEmployee(@PathVariable("id") int e_id){
        return service.getEmployeesById(e_id);
    }

    @PostMapping("/employee-data")
    public int insertData(@RequestBody EmployeeDetails employee) {
        service.saveEmployee(employee);
        return employee.getId();
    }

    @DeleteMapping("/employee-data/{id}")
    public void deleteSpecificEmployee(@PathVariable("id") int e_id){
        service.deleteEmployeeById(e_id);
    }

    @PutMapping("/employee-data/{id}")
    public ResponseEntity<EmployeeDetails> updateSpecificEmployee(@PathVariable("id")int e_id,
                                                  @RequestBody EmployeeDetails getEmp){
        EmployeeDetails updatedEmp=service.updateEmpById(e_id,getEmp);
        return ResponseEntity.ok(updatedEmp);
    }

    @GetMapping("/employee-data/count")
    public String countMethod(){
        return "The number of rows are: "+service.countTableRows();
    }

    @GetMapping("/employee-data/byname/{name}")
    public List<EmployeeDetails> questionFindByName(@PathVariable String name){
        return service.findByNameMethod(name);
    }

    @GetMapping("/employee-data/byage/{low}-{high}")
    public List<EmployeeDetails> questionFindBetweenAges(@PathVariable int low,@PathVariable int high){
        return service.findBetweenAges(low,high);
    }

    @GetMapping("/employee-data/byname/like-{name}")
    public List<EmployeeDetails> questionFindNameLike(@PathVariable String name){
        return service.findNameLike(name+"%");
    }
    @GetMapping("/employee-data/paging")
    public List<EmployeeDetails> employeeAgePagable(){
        return service.sortByAge();
    }
}
