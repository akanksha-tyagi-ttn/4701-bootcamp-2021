package com.jvmbootcamp.jpahibernate3.entities;
import javax.persistence.*;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Embedded
    private Address address;

    public Integer getId() { return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() { return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() { return address; }
    public void setAddress(Address address) {
        this.address = address;
    }
}
