package com.codeclan.example.employeeservice.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="employee")
    private String employee;

    @Column(name="project")
    private String project;

    @JsonIgnoreProperties({"assignment"})
    @Column(name="project")
    @OneToMany(mappedBy = "assignment")
    private List<Project> projects;


    public Assignment(){};


    public Assignment(String employee, String project, List<Project> projects) {
        this.employee = employee;
        this.project = project;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public List<Project> getProjects() {
        return projects;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
