package com.example.spring_data_jpa.controller;


import com.example.spring_data_jpa.entity.Employee;
import com.example.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        employeeService.deleteEmp(id);
        return "Employee with id = " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> findAllByName(@PathVariable String name) {
        return employeeService.findByName(name);
    }
}
