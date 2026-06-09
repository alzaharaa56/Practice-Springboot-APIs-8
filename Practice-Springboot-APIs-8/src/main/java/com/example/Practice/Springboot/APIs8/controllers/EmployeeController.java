package com.example.Practice.Springboot.APIs8.controllers;
import com.example.Practice.Springboot.APIs8.entities.Employee;
import com.example.Practice.Springboot.APIs8.services.EmployeeManager;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeManager employeeManager;
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeManager.getEmployees();
    }
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeManager.addEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}