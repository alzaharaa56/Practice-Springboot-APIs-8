package com.example.Practice.Springboot.APIs8.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Employee name is required")
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "employee", cascade= CascadeType.ALL, orphanRemoval = true)

    private List<Campaign> campaigns;

    public Employee() {
    }

    public Employee(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}