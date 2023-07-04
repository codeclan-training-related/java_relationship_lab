package com.codeclan.example.employeeservice.models;


import javax.persistence.*;

@Entity
@Table( name ="projects")
public class Project {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="duration")
    private int duration;

    @ManyToOne
    @JoinColumn(name="employee_id", nullable = false)
    private Employee employee;


    @ManyToOne
    @JoinColumn(name="assignment_id",nullable = false)
    private Assignment assignment;

    public Project(){}

    public Project(String name, int duration, Employee employee, Assignment assignment) {
        this.name = name;
        this.duration = duration;
        this.employee = employee;
        this.assignment = assignment;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Assignment getAssignment() {
        return assignment;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }
}
