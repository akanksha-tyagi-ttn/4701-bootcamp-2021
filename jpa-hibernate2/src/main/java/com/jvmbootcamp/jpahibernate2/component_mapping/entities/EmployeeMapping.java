package com.jvmbootcamp.jpahibernate2.component_mapping.entities;
import javax.persistence.*;
@Entity
@Table(name = "employee_mapping")
public class EmployeeMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="age")
    private Integer age;
    @Embedded
    private Salary salary;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) {
        this.firstname = firstname; }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Salary getSalary() { return salary; }
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
