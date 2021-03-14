package com.jvmbootcamp.jpahibernate2.component_mapping.services;
import com.jvmbootcamp.jpahibernate2.component_mapping.entities.EmployeeMapping;
import com.jvmbootcamp.jpahibernate2.component_mapping.repos.EmployeeSalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSalaryService {
    @Autowired
    EmployeeSalaryRepository repo;

    public List<EmployeeMapping> findAllEmployee() {
        return (List<EmployeeMapping>) repo.findAll();
    }

    public void employeeCreate(EmployeeMapping emp) {
        repo.save(emp);
    }
}
