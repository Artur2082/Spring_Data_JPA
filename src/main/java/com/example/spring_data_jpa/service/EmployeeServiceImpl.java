package com.example.spring_boot_practice.service;


import com.example.spring_boot_practice.dao.EmployeeDAO;
import com.example.spring_boot_practice.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }
    @Override
    @Transactional
    public void saveEmp(Employee employee) {
         employeeDAO.saveEmp(employee);
    }
    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }
    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
