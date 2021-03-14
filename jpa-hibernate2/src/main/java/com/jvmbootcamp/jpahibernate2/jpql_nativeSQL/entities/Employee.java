package com.jvmbootcamp.jpahibernate2.jpql_nativeSQL.entities;
import javax.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empId;

    @Column(name="first_name")
    String empFirstName;

    @Column(name="last_name")
    String empLastName;

    @Column(name="salary")
    double empSalary;

    @Column(name="age")
    int empAge;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }
    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }
    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "empId=" + empId +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                ']';
    }
}
