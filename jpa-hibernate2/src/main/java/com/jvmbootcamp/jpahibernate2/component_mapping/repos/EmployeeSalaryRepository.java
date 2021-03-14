package com.jvmbootcamp.jpahibernate2.component_mapping.repos;
import com.jvmbootcamp.jpahibernate2.component_mapping.entities.EmployeeMapping;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeSalaryRepository
        extends CrudRepository<EmployeeMapping, Integer> {
}
