package org.models.RelationshipsPractice;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_projects",
            joinColumns = @JoinColumn(name = "eid"),
            inverseJoinColumns = @JoinColumn(name = "pid"))
    Set<Project> projects;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, Set<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
