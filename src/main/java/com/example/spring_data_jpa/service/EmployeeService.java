package com.example.spring_boot_practice.service;


import com.example.spring_boot_practice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public void saveEmp(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmp(int id);
}
