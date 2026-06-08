package com.example.Practice.Springboot.APIs8;



import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("/employees")
    public class EmployeeController {
        private final EmployeeManager manager;

        public EmployeeController(EmployeeManager manager) {
            this.manager = manager;
        }

        @PostMapping("/add")
        public String addEmployee(@RequestBody Employee employee) {
            return manager.addEmployee(employee);
        }

        @GetMapping("/list")
        public List<Employee> listEmployees() {
            return manager.getEmployees();
        }
    }

