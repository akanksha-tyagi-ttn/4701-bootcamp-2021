package com.jvmbootcamp.jpa_assignment.repos;

import com.jvmbootcamp.jpa_assignment.entities.EmployeeDetails;
import org.springframework.data.repository.CrudRepository;

//<entity,primaryKey(id) in that Entity>
public interface EmployeeRepository
        extends CrudRepository<EmployeeDetails,Integer>
{

}
