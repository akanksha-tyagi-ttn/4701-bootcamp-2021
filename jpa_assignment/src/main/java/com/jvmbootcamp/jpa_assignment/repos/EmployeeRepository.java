package com.jvmbootcamp.jpa_assignment.repos;

import com.jvmbootcamp.jpa_assignment.entities.EmployeeDetails;
//import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//<entity,primaryKey(id) in that Entity>
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetails,Integer> {
    List<EmployeeDetails> findByName(String name);

    List<EmployeeDetails> findByAgeBetween(int low,int high);

    List<EmployeeDetails> findByNameLike(String name);

    List<EmployeeDetails> findAll(Pageable pageable);
}

