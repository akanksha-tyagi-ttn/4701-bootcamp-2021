package com.jvmbootcamp.restapi1.assignment;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.Size;

@ApiModel(description = "All details about the Employee")
public class Employee {
    private Integer id;
    @Size(min = 3, max = 30, message = "length should be greater than 3 and less than 30")
    private String name;
    private Integer age;

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "\nid=" + id +
                ",\nname='" + name + '\'' +
                ",\nage=" + age +
                '}';
    }
}
