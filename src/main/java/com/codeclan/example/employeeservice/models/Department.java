package com.codeclan.example.employeeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="departments")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="name")
    private String name;


    @ManyToOne
    @JoinColumn(name="employee_id", nullable = false)
    private Employee employee;


    public Department(){};


    public Department(String name, Employee employee) {
        this.name = name;
        this.employee =employee;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
