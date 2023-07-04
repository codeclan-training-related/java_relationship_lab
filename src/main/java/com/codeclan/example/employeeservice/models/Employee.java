package com.codeclan.example.employeeservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table( name ="employees")
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name ="id")
    private Long id;


    @Column( name="first_name")
    private String firstName;

    @Column( name ="last_name")
    private String lastName;

    @Column(name =" employee_num")
    private String employeeNum;



    @JsonIgnoreProperties({"employee"})
    @Column(name ="departments")
    @OneToMany(mappedBy = "employee")
    private List<Department> departments;


    public Employee(){};

    public Employee(String firstName, String lastName, String employeeNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNum = employeeNum;
        this.departments =new ArrayList<Department>();
//        this.assignments = new ArrayList<Assignment>();

    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    //    public List<Assignment> getAssignments() {
//        return assignments;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    //    public void setAssignments(List<Assignment> assignments) {
//        this.assignments = assignments;
//    }
}
