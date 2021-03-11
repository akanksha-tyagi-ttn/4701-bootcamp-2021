package com.jvmbootcamp.jpa_assignment;

import com.jvmbootcamp.jpa_assignment.entities.EmployeeDetails;
import com.jvmbootcamp.jpa_assignment.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaAssignmentApplicationTests {

	@Autowired
	EmployeeRepository empRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		EmployeeDetails emp=new EmployeeDetails();
		emp.setId(102);
		emp.setName("tanyatyagi");
		emp.setAge(22); emp.setLocation("America");
		empRepo.save(emp);
	}
}
