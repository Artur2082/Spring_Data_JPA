package com.example.spring_data_jpa.service;


import com.example.spring_data_jpa.entity.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAll();
    public void saveEmp(Employee employee);
    public Employee getEmp(int id);
    public void deleteEmp(int id);
    public List<Employee> findByName(String name);
}
