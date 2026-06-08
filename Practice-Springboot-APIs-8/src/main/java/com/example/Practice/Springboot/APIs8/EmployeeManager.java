package com.example.Practice.Springboot.APIs8;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Marketing"));
    }

    public String addEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employee.getEmployeeId())) {
                return "Employee ID already exists\nNo employee was created";
            }
        }
        employees.add(employee);
        return "Employee Added Successfully\nEmployee ID: " + employee.getEmployeeId() +
                "\nEmployee Name: " + employee.getEmployeeName() +
                "\nDepartment: " + employee.getDepartment() +
                "\nStatus: Created";
    }

    public List<Employee> getEmployees() { return employees; }
}
