package com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.repos;

import com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("from Employee")
    List<Employee> findAllEmployees();

    //Display the first name, last name of all employees
    // having salary greater than average salary ordered in ascending
    // by their age and in descending by their salary.
    @Query("select empFirstName,empLastName from Employee " +
            "where empSalary > (select AVG(empSalary) from Employee) " +
            "Order By empAge ASC,empSalary DESC ")
    List<Object[]> findAllEmployeePartialData();

    //first returning the list of employees whose salary < average
    @Query("select avg(empSalary) from Employee")
    Double findAVGSalary();

    //question2:  update salary of employee with passed increment where existing salary<average
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Employee SET empSalary=empSalary+ :incValue where empSalary< :average")
    int updateEmployeeSalary(@Param("incValue")Double increment,
                              @Param("average")Double average);

    //Delete all employees with minimum salary.
    @Modifying(clearAutomatically = true)
    @Query("delete from Employee where empSalary<:minSalary")
    int deleteAllEmployeesMinSalary(@Param("minSalary") Double minSalary);


    //native query

    //Display the id, first name, age of all employees where
    // last name ends with "singh"
    @Query(value="select id,first_name,age from employee_table " +
            "where last_name like %:last_name",nativeQuery = true)
    List<Object[]> employeesWithLastName(@Param("last_name") String last_name);

    //Delete all employees with age greater than 45
    // (Should be passed as a parameter)
    @Modifying(clearAutomatically = true)
    @Query(value="delete from employee_table where age>:givenAge",nativeQuery = true)
    int deleteEmployeeAgeGreaterThan45(@Param("givenAge") int givenAge);

}
