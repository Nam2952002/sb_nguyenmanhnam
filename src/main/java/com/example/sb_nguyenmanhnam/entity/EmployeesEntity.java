package com.example.sb_nguyenmanhnam.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class EmployeesEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private Integer wage;

    public EmployeesEntity() {
    }

    public EmployeesEntity(String name, Integer wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
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

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

}
